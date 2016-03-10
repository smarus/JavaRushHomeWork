package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/


import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        String filename2 = reader.readLine();
       FileReader fileReader = new FileReader(filename);
        ArrayList<Integer> list = new ArrayList<Integer>();


        String s ="";
        String s2 = "";
        while (fileReader.ready())
        {
             s += (char)fileReader.read();
        }
            String s1[]=s.split(" ");
            for (int i = 0; i <s1.length ; i++)
            {
               try
               {
                   int integer = Integer.parseInt(s1[i]);
                  s2+=integer+" ";
               }
               catch (Exception e)
               {

               }


        }
        char[]chars = s2.toCharArray();
        char[] chars2 = new char[chars.length-1];
        for (int i = 0; i <chars2.length; i++)
        {
            chars2[i] = chars[i];
        }
        FileWriter writer = new FileWriter(filename2);
        writer.write(chars2);
        fileReader.close();
        writer.close();
        reader.close();



    }
}
