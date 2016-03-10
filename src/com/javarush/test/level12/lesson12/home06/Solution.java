package com.javarush.test.level12.lesson12.home06;

/* Fly, Run, Climb для классов Cat, Dog, Tiger, Duck
1. Внутри класса Solution создай интерфейс public interface Fly(летать) с методом void fly().
2. Внутри класса Solution создай интерфейс public interface Climb(лазить по деревьям) с методом void climb().
3. Внутри класса Solution создай интерфейс public interface Run(бегать) с методом void run().
4. Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
5. Добавь интерфейсы классам Cat(кот), Dog(собака), Tiger(тигр), Duck(Утка).
*/

public class Solution {

    public class Cat  implements Climb,Run{
        @Override
        public void Climb()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void Run()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    public class Dog implements Run{
        @Override
        public void Run()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    public class Tiger extends Cat implements Run,Climb{
    }

    public class Duck implements Fly,Run{
        @Override
        public void Fly()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void Run()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }
    public interface Fly
    {
        public void Fly();
    }
    public interface Climb
    {
        public void Climb();
    }
    public interface Run
    {
        public void Run();
    }
}
