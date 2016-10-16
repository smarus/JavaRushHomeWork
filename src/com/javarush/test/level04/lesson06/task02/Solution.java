package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        int b1 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(a2);
        int b3 = Integer.parseInt(a3);
        if(b1>=b2&&b1>=b3)
        {
            System.out.println(b1);
            if(b2>=b3)
                {
                System.out.println(b2);
                System.out.println(b3);
                }
            else
            {
                System.out.println(b3);
                System.out.println(b2);

            }
        }
        else if (b2>=b1&&b2>=b3)
        {
            System.out.println(b2);
            if(b1>=b3)
            {
                System.out.println(b1);
                System.out.println(b3);
            }
            else
            {
                System.out.println(b3);
                System.out.println(b1);

            }
        }

        else
            {
            System.out.println(b3);
              if(b2>=b1)
            {
                System.out.println(b2);
                System.out.println(b1);
            }
            else
            {
                System.out.println(b1);
                System.out.println(b2);

            }

            }

        //Напишите тут ваш код

    }

}
