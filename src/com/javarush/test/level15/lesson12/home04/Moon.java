package com.javarush.test.level15.lesson12.home04;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 23.10.15
 * Time: 17:01
 * To change this template use File | Settings | File Templates.
 */
public class Moon implements Planet
{
    private static Moon moon;
    private Moon()
    {

    }
    public static Moon getInstance()
    {
        if (moon==null)
            moon = new Moon();
        return moon;
    }
}

