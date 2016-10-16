package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 =reader.readLine();
        int n = Integer.parseInt(n1);
        int maximum = -1000;
        if (n>0)
        {
            for (int i = 0; i < n; i++)
            {
                int a = Integer.parseInt(reader.readLine());
                if(a>maximum)
                    maximum = a;

            }
        }

        System.out.println(maximum);
    }
}
