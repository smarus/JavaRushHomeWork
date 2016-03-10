package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 21.10.15
 * Time: 12:45
 * To change this template use File | Settings | File Templates.
 */
public class Singleton
{
    private static Singleton singleton;
    public static Singleton getInstance()
    {
       if (singleton==null)
           singleton = new Singleton();
        return singleton;
    }
    private Singleton()
    {

    }
}
