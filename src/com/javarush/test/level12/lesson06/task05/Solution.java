package com.javarush.test.level12.lesson06.task05;

/* Классы Cat и Dog от Pet
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static abstract class Pet
    {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public static class Cat  extends Pet
    {

        @Override
        public String getName()
        {
            return "Koshka";  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Cat getChild()
        {
            return new Cat();  //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    public static class Dog  extends Pet
    {

        @Override
        public String getName()
        {
            return "sobaka";  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Dog getChild()
        {
            return new Dog();  //To change body of implemented methods use File | Settings | File Templates.
        }
    }

}
