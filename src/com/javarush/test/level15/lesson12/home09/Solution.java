package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          String s = reader.readLine();
        String [] s2 = s.split("[?]");
        String []s3 = s2[1].split("&");
        String s5=null;
        for (int i = 0; i <s3.length ; i++)
        {
            String []s4 = s3[i].split("=");

                System.out.print(s4[0] + " ");

           if (s4[0].equals("obj"))
           {
                 s5 = s4[1];

           }

        }
        System.out.println();
        if (s5!=null)
        {
        try {
            alert(Double.parseDouble(s5));
        }
        catch (Exception e)
        {
            alert(s5);
        }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
