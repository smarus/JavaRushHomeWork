package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
       try {
           int []a = new int[2];
           a[8]=10;
       }
       catch (IndexOutOfBoundsException e)
       {
           exceptions.add(e);
       }
        try {
           ArrayList<Integer> list = new ArrayList<Integer>();
            list.get(20);

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        for (int i = 0; i <7 ; i++)
        {
            try
            {
                float bi = 1 / 0;

            } catch (Exception e)
            {
                exceptions.add(e);
            }
        }

        //Add your code here

    }
}
