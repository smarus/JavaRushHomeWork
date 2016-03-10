package com.javarush.test.level14.lesson06.home01;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 21.10.15
 * Time: 8:46
 * To change this template use File | Settings | File Templates.
 */
public class MoldovanHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 50;
    }
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.MOLDOVA+". Я несу "+getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
}
