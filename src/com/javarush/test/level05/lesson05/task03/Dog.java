package com.javarush.test.level05.lesson05.task03;

/* Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
*/

public class Dog {
    private String name;
    private int age;
 public void setName(String name)
 {
     this.name=name;
 }
 public String getName()
 {
     return name;
 }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }

    //добавьте переменные класса тут

    //добавьте геттеры и сеттеры тут

   public static void main(String[] args)
    {
        //Dog dog = new Dog();
        //dog.setName();
        //dog.setAge();
    }

}