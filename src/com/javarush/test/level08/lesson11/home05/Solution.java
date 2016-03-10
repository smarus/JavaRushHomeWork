package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/
         //Made in Ruslan all hard is simple)))
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char []str = s.toCharArray();
        for (int i = 0; i <str.length ; i++)
        {
           str[0]=Character.toUpperCase(str[0]);
            if (str[i]==' '&&!(str[i+1]==' '))
                str[i+1]=Character.toUpperCase(str[i+1]);
        }
        for (int i = 0; i <str.length ; i++)
        {
            System.out.print(str[i]);
        }

        //напишите тут ваш код
    }


}
