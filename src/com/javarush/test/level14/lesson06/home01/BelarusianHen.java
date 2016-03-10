package com.javarush.test.level14.lesson06.home01;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 21.10.15
 * Time: 8:46
 * To change this template use File | Settings | File Templates.
 * MADE by Ruslan Kurmanov
 */
public class BelarusianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 70;  //To change body of implemented methods use File | Settings | File Templates.
    }
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.BELARUS+". Я несу "+getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
}
