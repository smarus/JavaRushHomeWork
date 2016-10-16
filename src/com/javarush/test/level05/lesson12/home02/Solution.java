package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

import java.security.PrivateKey;

public class Solution
{
    public static void main(String[] args)
    {
        Man man1=new Man("Ruslan",18,"dsfjklsdfjkl");
        Woman woman=new Woman("Chynara",18,"ELjklfjlask");
        man1.print();
        woman.print();

        // Создай по два объекта каждого класса тут

        // Выведи их на экран тут
    }
    public  static class Man
    {
        private String name;
        private int age;
        private String address;
        public Man(String name,int age,String address)
        {
           this.name = name;
           this.age = age;
           this.address = address;

        }
        public  void print()
        {
            System.out.println(name + " " + age + " " + address);
        }
    }

    public static class Woman
    {
        private String name;
        private int age;
        private String address;
        public Woman(String name,int age,String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;

        }
        public  void print()
        {
            System.out.println(name + " " + age + " " + address);
        }
    }

    // Напиши тут свои классы
}
