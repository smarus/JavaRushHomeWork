package com.javarush.test.level15.lesson12.home04;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 23.10.15
 * Time: 17:06
 * To change this template use File | Settings | File Templates.
 */
public class Earth implements Planet
{
    private static Earth earth;
    private Earth()
    {

    }
    public static Earth getInstance()
    {
        if (earth==null)
            earth = new Earth();
        return earth;
    }
}

