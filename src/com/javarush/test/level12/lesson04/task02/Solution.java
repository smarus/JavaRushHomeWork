package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
       Solution.printAll();

    }

    //Напишите тут ваши методы
    public static void print(int n)
    {

    }
    public static void print(Integer n)
    {

    }
    public static void printAll()
    {
        print(2);
        print(new Integer(2));

    }
}
