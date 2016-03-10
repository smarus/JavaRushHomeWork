package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Solution {
    public static void main(String[] args)throws IOException{
         //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename =args[0];
        FileInputStream fileInputStream = new FileInputStream(filename);
        int symbols = 0;
        int count =0;
        while (fileInputStream.available()>0)
        {

           if (fileInputStream.read()==32)
               count++;

            symbols++;

        }
       float result = (float) count/symbols*100;

        System.out.println(String.format(Locale.ENGLISH,"%.2f",result));
        fileInputStream.close();
           }
}
