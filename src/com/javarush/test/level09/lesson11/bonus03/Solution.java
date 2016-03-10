package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
        int number=0,strings=0,obshee=array.length;
        for (int i = 0; i <array.length ; i++)
        {
            if (isNumber(array[i]))
            {

               number++;
            }
            else
            {
                strings++;
            }

        }
     String [] list = new String[strings];
    Integer [] list2 = new Integer[number];
        String array1[] = new String[array.length];
        number=0;
        strings=0;
        for (int i = 0; i <obshee ; i++)
        {
             if (isNumber(array[i]))
             {
                 list2[number]=Integer.parseInt(array[i]);
                 number++;
             }
            else
             {
                 list[strings]=array[i];
                 strings++;
             }
        }
        int temp=0;
        for (int i = 0; i <list2.length ; i++)
        {
            for (int j = 0; j <list2.length-1; j++)
            {
                   if (list2[j]<list2[j+1])
                   {
                       temp = list2[j+1];
                       list2[j+1]=list2[j];
                       list2[j] = temp;
                   }
            }
        }
        String temp1 = null;
        for (int i = 0; i <list.length ; i++)
        {
            for (int j = 0; j <list.length-1 ; j++)
            {
                  if (isGreaterThan(list[j],list[j+1]))
                {
                    temp1 = list[j+1];
                    list[j+1]=list[j];
                    list[j] = temp1;
                }
            }
        }
        number=0;
        strings=0;
        for (int i = 0; i <array1.length ; i++)
        {
              if (isNumber(array[i]))
              {
                  array[i]= String.valueOf(list2[number]);
                  number++;
              }
            else {
                  array[i]=list[strings];
                  strings++;
              }
        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
