package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
            //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m =reader.readLine();
        String n =reader.readLine();
        int m1 = Integer.parseInt(m);
        int n1 = Integer.parseInt(n);
        for(int i=1;i<=m1;i++)
        {
           for(int j=1;j<=n1;j++)
            {
                System.out.print("8");

            }
            System.out.println();
        }

    }
}
