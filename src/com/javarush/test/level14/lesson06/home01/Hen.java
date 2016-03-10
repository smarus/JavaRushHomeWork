package com.javarush.test.level14.lesson06.home01;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 21.10.15
 * Time: 8:43
 * To change this template use File | Settings | File Templates.
 */
public abstract class Hen
{
    abstract int  getCountOfEggsPerMonth();
    String getDescription()
    {
        return "Я курица.";
    }
}
