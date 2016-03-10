package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 24.10.15
 * Time: 13:57
 * To change this template use File | Settings | File Templates.
 */
public abstract class DrinkMaker
{
  abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    public void makeDrink()
    {
        getRightCup();
        putIngredient();
        pour();
    }
}
