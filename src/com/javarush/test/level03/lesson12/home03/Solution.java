package com.javarush.test.level03.lesson12.home03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String n =reader.readLine();
        int b=Integer.parseInt(n);
        System.out.println("Я буду зарабатывать $"+b+" в час");


        //Напишите тут ваш код
    }
}