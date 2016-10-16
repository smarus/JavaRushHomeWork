package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String name;
    private int age;
    private char pol;
    public Friend(String name)
    {
     this.name = name;
    }
    public Friend(int age)
    {
        this.age = age;
    }
    public Friend(char pol)
    {
        this.pol = pol;
    }
    //Напишите тут ваш код

}