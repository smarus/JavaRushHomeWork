package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        //напишите тут ваш код
       String s = CreateTExt();
        Map<String,Integer> map=  Map();
       searhch(map,s);

    }
    public static String CreateTExt() throws IOException
    {
      BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
       return  reader.readLine();


    }
    public static void searhch(Map<String,Integer>map,String s)
    {
        for (Map.Entry<String,Integer> pair:map.entrySet())
        {
           if (pair.getKey().equals(s))
           {
               System.out.println(pair.getKey()+ " is " + pair.getValue() + " month");
           }
        }
    }
    private static Map<String,Integer> Map()

    {

        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("January",1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May",5);
        map.put("June",6);
        map.put("July",7);
        map.put("August",8);
        map.put("September",9);
        map.put("October",10);
        map.put("November",11);
        map.put("December",12);

        return  map;
    }

}
