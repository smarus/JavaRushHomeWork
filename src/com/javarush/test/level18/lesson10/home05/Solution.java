package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/


import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        String filename2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(filename);
        FileOutputStream fileOutputStream = new FileOutputStream(filename2);
        String s = "";
        ArrayList<Long> list = new ArrayList<Long>();
        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            s = s + (char) data;
        }
        String[] values = s.split(" ");
        long num = 0;

        for (int i = 0; i < values.length; i++)
        {
            int k = 0;
            String f = "";

            f = values[i];
            num = Math.round(Double.parseDouble(f));
            list.add(num);
        }


        for(Long l:list)
        {
            String d="";
             d = d+l+" ";
            fileOutputStream.write(d.getBytes());
        }



        reader.close();
        inputStream.close();
        fileOutputStream.close();
    }
}
