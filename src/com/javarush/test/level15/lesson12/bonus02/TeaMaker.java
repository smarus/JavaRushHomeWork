package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 24.10.15
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 */
public class TeaMaker extends DrinkMaker
{
    @Override
    void getRightCup()
    {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient()
    {
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour()
    {
        System.out.println("Заливаем водой");
    }
}
