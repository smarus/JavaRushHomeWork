package com.javarush.test.level14.lesson08.home09;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 21.10.15
 * Time: 11:15
 * To change this template use File | Settings | File Templates.
 */
public class USD extends Money
{

    public USD(double amount)
    {
        super(amount);
    }

    public String getCurrencyName()
    {
        return "USD";  //To change body of implemented methods use File | Settings | File Templates.
    }
}
