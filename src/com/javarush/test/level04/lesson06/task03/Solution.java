package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String a2 = reader.readLine();
        String a3 = reader.readLine();
        String a4 = reader.readLine();
        int b1 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(a2);
        int b3 = Integer.parseInt(a3);
        int b4 = Integer.parseInt(a4);
        if(b1>b2&&b1>b3&&b1>b4)
            System.out.println(b1);
        else if (b2>=b1&&b2>=b3&&b2>=b4)
            System.out.println(b2);
        else if (b3>=b2&&b3>=b1&&b3>=b4)
            System.out.println(b4);
        else if (b4>=b2&&b4>=b3&&b4>=b1)
            System.out.println(b4);
        else if(b1==b2&&b1==b3&&b1==b4)
            System.out.println(b1);


        //Напишите тут ваш код

    }
}
