package com.javarush.test.level04.lesson02.task03;

/* Реализовать метод setCatsCount
Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать значение переменной catsCount равное переданному параметру.
*/

public class Cat {
    private static int catsCount = 0;
    int getCatsCount()
    {
        return catsCount;
    }
    public static void setCatsCount(int catsCounts) {
        catsCount=catsCounts;
        //add your code here
    }
}
