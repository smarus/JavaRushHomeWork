package com.javarush.test.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Руслан on 25.12.2015.
 */

class Cat
{
    public String name;
    public int age;

    public String getName()
    {
        return name;
    }


    private static void swap(int a, int b)
    {
        int c = a;
        a = b;
        b = c;
    }

    private static void ageSwap(Cat a,
                                Cat b)
    {
        int c = a.age;
        a.age = b.age;
        b.age = c;
    }

    public static void main(String[] args) throws IOException
    {

        int m = 5;
        int n = 6;

        System.out.println("M=" + m + " N=" + n);
        swap(m, n);
        System.out.println("M=" + m + " N=" + n);
        Cat olga = new Cat();
        olga.name = "Olga";
        olga.age = 21;
        Cat vera = new Cat();
        vera.name = "Veronika";
        vera.age = 15;
        System.out.println("O0lga is " + olga.age);
        System.out.println("Vera is " + vera.age);
        ageSwap(olga, vera);
        System.out.println("Olga is " + olga.age);
        System.out.println("Vera is " + vera.age);


    }
}

