package com.javarush.test.level14.lesson08.home05;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 21.10.15
 * Time: 10:33
 * To change this template use File | Settings | File Templates.
 */
public class Computer

{
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;

    public Computer()
    {
        this.keyboard =  new Keyboard();
        this.mouse = new Mouse();
        this.monitor = new Monitor();
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }

    public Mouse getMouse()
    {

        return mouse;
    }


}
