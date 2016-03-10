package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String s = reader.readLine();
     reader.close();
    FileInputStream fileInputStream = new FileInputStream(s);
     int count=0;
     while (fileInputStream.available()>0)
     {

         if (fileInputStream.read()==((int)','))
         {
             count++;
         }

     }
        System.out.println(count);
        fileInputStream.close();
    }
}
