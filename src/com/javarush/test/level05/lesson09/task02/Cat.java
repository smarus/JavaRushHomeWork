package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name;
    private int age;
    private double weight;
    private char pol;
    private String address;
    public Cat(String name)
    {
        this.name = name;
    }
    public Cat(int age)
    {
        this.age = age;
    }
    public Cat(char pol)
    {
        this.pol = pol;
    }
    public Cat(double weight)
    {
        this.weight=weight;
    }
    public Cat(String folder ,String address)
    {
        this.address = folder + address;
    }
    //Напишите тут ваш код

}
