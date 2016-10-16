package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 =reader.readLine();
        String b1 =reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        if(a>b)
            System.out.println(b);
        else
            System.out.println(a);
        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */
    }
}