package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/
 import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(filename);
        FileOutputStream fileout = new FileOutputStream(filename2);
        byte [] list = new byte[fileInputStream.available()];

        while (fileInputStream.available()>0)
        {
            fileInputStream.read(list);
        }
            int k =0;
        for (int i = list.length; i>0 ; i--)
        {
           fileout.write(list[i-1]);
        }

        fileInputStream.close();
        fileout.close();

    }
}
