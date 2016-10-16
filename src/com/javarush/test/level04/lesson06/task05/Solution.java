package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           String name = reader.readLine();
           String a1 = reader.readLine();
            int b1 = Integer.parseInt(a1);
        if(b1<18)
            System.out.println("Подрасти еще");

        //Напишите тут ваш код

    }
}
