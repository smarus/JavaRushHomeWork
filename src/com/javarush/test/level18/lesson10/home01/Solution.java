package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)  throws IOException{
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = args[0];

        int count=0;
        FileInputStream fileInputStream = new FileInputStream(filename);
        byte [] chars = new byte[fileInputStream.available()];
        fileInputStream.read(chars);
        for (int i = 0; i <chars.length ; i++)
        {




            if ((chars[i]>=65&&chars[i]<=90)||(chars[i]>=97&&chars[i]<=122))
                count++;
        }
        System.out.println(count);
        fileInputStream.close();
       // reader.close();
    }
}
