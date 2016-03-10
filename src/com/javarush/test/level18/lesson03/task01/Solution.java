package com.javarush.test.level18.lesson03.task01;

import java.io.FileInputStream;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        FileInputStream in = new FileInputStream(s);
        int summa=0;
        while (in.available()>0)
        {
            int data = in.read();
            if (summa<data)
                summa = data;
        }
        System.out.println( summa);
        in.close();
    }
}
