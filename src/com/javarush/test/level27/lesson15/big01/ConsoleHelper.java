package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Dish;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class ConsoleHelper
{
    private static  BufferedReader console  = new BufferedReader(new InputStreamReader(System.in));
    public static void writeMessage(String message)
    {
        System.out.println(message);
    }
    public static String readString() throws IOException
    {
        return console .readLine();
    }
    public static List<Dish> getAllDishesForOrder() throws IOException
    {
        List<Dish> l = new ArrayList<>();
        String str;
        writeMessage(Dish.allDishesToString());
        str = readString();
        while (!"exit".equals(str))
        {
            try
            {
                l.add(Dish.valueOf(str));
            }
            catch (IllegalArgumentException e)
            {
                ConsoleHelper.writeMessage(str + " is not detected");
            }
            str = readString();
        }
        return l;
    }
}