package com.javarush.test.level04.lesson02.task05;

/* Подсчитать количество котов
Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильно их количество.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
          cat1.count++;
        //add your code here
        System.out.println();
        Cat cat2 = new Cat();
        cat2.count++;
        //add your code here
        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count;
    }
}