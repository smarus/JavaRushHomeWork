package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private int height;
    private char color;
    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(int height)
    {
        this.height = height;
    }
    public void initialize(char color)
    {
        this.color = color;
    }
    //Напишите тут ваш код

}