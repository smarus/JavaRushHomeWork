package com.javarush.test.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller extends JFrame {
                 public  static String string;
    Panel panel;
    public static int count=0;


    public Controller(){
        super("Window");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        setLayout(new BorderLayout());
        panel = new Panel();
        panel.read.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                       Functions converter = new Functions();
                    converter.readInfo();
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(new JPanel(), "Not input.txt file!");
                }

            }
        });
        panel.write.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String word = panel.output.getText();
                word = word.toLowerCase();
                Pattern pattern =Pattern.compile("\\b"+word+"\\b");
                Matcher matcher =pattern.matcher(string.toLowerCase());
                System.out.println("word"+"\\+");
                while (matcher.find())
                {
                    count++;
                }
                panel.output.setText(count+"");
                Functions functions = new Functions();
                functions.writeTXT();

            }
        });

        add(panel, BorderLayout.NORTH);
        setSize(600,630);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public class Panel extends JPanel{
        public JButton read = new JButton("Read");
        public JButton write = new JButton("Write");
        TextArea input  = new TextArea("", 10, 40);
        TextArea output = new TextArea("", 25, 40);

        public Panel(){
            setLayout(new FlowLayout());

            add(input);
            add(read);
            add(output);
            add(write);


        }

    }

    class Functions
    {
        Functions(){
        }

        void readInfo(){
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/rus/input.txt"),"UTF-8"));
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = br.readLine()) != null) {
                      sb.append(line);
                    System.out.println(line);
                }

                panel.input.setText(sb.toString());
                string = sb.toString();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        void writeTXT(){
            try {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/rus/out.txt"),"Windows-1251"));
                bw.write(count + "");
                bw.close();
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {
        new Controller();
    }
}