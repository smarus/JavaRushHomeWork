package com.javarush.test.level15.lesson12.home04;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 23.10.15
 * Time: 16:59
 * To change this template use File | Settings | File Templates.
 */
public class Sun implements Planet
{
    private static Sun sun;
    private Sun()
    {

    }
    public static Sun getInstance()
    {
        if (sun==null)
            sun = new Sun();
        return sun;
    }
}
