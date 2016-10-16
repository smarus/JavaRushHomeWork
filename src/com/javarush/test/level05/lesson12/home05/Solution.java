package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i=1,b=0;
         int summa=0,a1;
        while (!(b==1))
            {
                String name = reader.readLine();

            if (name.equals("сумма"))
            {
                 b=1;
            }
            else
            {
           a1 = Integer.parseInt(name);
            summa=summa+a1;
            }
            }
        System.out.println(summa);
        }

        //Напишите тут ваш код
   }
