package com.javarush.test.level14.lesson08.home09;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 21.10.15
 * Time: 11:13
 * To change this template use File | Settings | File Templates.
 */
public class Hrivna extends Money
{

    public Hrivna(double amount)
    {
        super(amount);
    }

    public String getCurrencyName()
    {
        return "HRN";
    }
}
