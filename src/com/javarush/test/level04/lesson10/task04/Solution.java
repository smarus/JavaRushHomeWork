package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {    int i=10;
        //Напишите тут ваш код
        while (!(i==0))
        {
            int j=9;


            while (!(j==0))
            {
                System.out.print('S');
                j--;


            }
            System.out.println('S');
            i--;
        }

    }
}
