package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String catname=null;
    private double weight;
    private int age;
    private char color;
    private String addres=null;

    public void initialize(String catname)
    {
        this.catname = catname;
    }

    public void initialize(double weight)
    {
        this.weight = weight;

    }

    public void initialize(char color)
    {
        this.color = color;
    }
    public void initialize(int age)
    {
        this.age = age;
    }
    public void initialize(String folder,String addres)
    {
        this.addres = folder + addres;
    }
    //Напишите тут ваш код

}
