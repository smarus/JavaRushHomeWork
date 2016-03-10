package com.javarush.test.level12.lesson09.task03;

/* Fly, Move, Eat для классов Dog, Car, Duck, Airplane
Есть public интерфейсы Fly(летать), Move(передвигаться), Eat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly
    {
        public void fly();
    }

    public interface Move
    {
        public void move();
    }

    public interface Eat
    {
        public void eat();
    }

    public class Dog implements Move,Eat
    {
        @Override
        public void eat()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void move()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    public class Duck implements Fly,Eat ,Move
    {
        @Override
        public void eat()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void fly()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void move()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    public class Car implements Move
    {
        @Override
        public void move()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    public class Airplane  implements Fly ,Move
    {
        @Override
        public void fly()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void move()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
