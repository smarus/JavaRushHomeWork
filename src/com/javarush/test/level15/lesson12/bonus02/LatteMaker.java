package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 24.10.15
 * Time: 13:59
 * To change this template use File | Settings | File Templates.
 */
public class LatteMaker extends DrinkMaker
{
    @Override
    void getRightCup()
    {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient()
    {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Делаем кофе");
    }

    @Override
    void pour()
    {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Заливаем молоком с пенкой");
    }
}
