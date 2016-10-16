package com.javarush.test.level20.lesson10.home07;

import java.io.*;

/* Переопределение сериализации в потоке
Сериализация/десериализация Solution не работает.
Исправьте ошибки не меняя сигнатуры методов и класса.
Метод main не участвует в тестировании.
Написать код проверки самостоятельно в методе main:
1) создать экземпляр класса Solution
2) записать в него данные  - writeObject
3) сериализовать класс Solution  - writeObject(ObjectOutputStream out)
4) десериализовать, получаем новый объект
5) записать в новый объект данные - writeObject
6) проверить, что в файле есть данные из п.2 и п.5
*/
public class Solution implements Serializable, AutoCloseable {
   transient   private FileOutputStream stream;
    private String filename;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.filename = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(this.filename, true);

    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception
    {
      Solution solution = new Solution("C:/rus/data.txt");
        solution.writeObject("ruslan");
        solution.writeObject("chinara");
        solution.close();
       FileOutputStream fileOutputStream = new FileOutputStream("C:/rus/data1.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
       objectOutputStream.writeObject(solution);
        objectOutputStream.flush();
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("C:/rus/data1.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Solution object = (Solution)objectInputStream.readObject();
        objectInputStream.close();
        object.writeObject("nurlan");
        object.writeObject("dfsd");
        object.close();



    }

}
