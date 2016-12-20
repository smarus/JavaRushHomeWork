package com.javarush.test.level30.lesson15.big01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;



public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();
    private static class Handler extends Thread {
        private Socket socket;
        public Handler(Socket socket) {
            this.socket = socket;
        }
        @Override
        public void run() {
            String userName = null;
            ConsoleHelper.writeMessage(("Just connected to " + socket.getRemoteSocketAddress()));
            try (Connection connection = new Connection(socket))
            {
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(connection, userName);
                serverMainLoop(connection, userName);
                ConsoleHelper.writeMessage("Connection with remote address has been closed");
            }
            catch (IOException | ClassNotFoundException e)
            {
                ConsoleHelper.writeMessage("Remote address connection error");
                if (userName != null && !userName.equals(""))
                {
                    connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    String text = userName + ": " + message.getData();
                    sendBroadcastMessage(new Message(MessageType.TEXT, text));
                } else {
                    ConsoleHelper.writeMessage("This message don't TEXT");
                }
            }
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException{

            for(Map.Entry<String,Connection> pair:connectionMap.entrySet()){
                if (!pair.getKey().equals(userName)){
                    connection.send(new Message(MessageType.USER_ADDED,pair.getKey()));
                }
            }

        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException{
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message message = connection.receive();
                if (MessageType.USER_NAME.equals(message.getType())) {
                    String name = message.getData();
                    if (name != null && !"".equals(name) && !connectionMap.containsKey(message.getData())) {
                        connectionMap.put(message.getData(), connection);
                        connection.send(new Message(MessageType.NAME_ACCEPTED));
                        return name;
                    }
                }
            }
        }
    }
    public static void sendBroadcastMessage(Message message){
        try {
            for (Connection connection : connectionMap.values()) {
                connection.send(message);
            }
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Не удалось отправить сообщение!");
        }
    }
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            int port = ConsoleHelper.readInt();
            serverSocket = new ServerSocket(port);
            ConsoleHelper.writeMessage("Сервер запущен!");
            while (true) {
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (Exception e) {
            try {
                serverSocket.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
}