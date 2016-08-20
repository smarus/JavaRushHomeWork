package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Руслан on 26.04.2016.
 */
public class Hippodrome
{
    public static Hippodrome game;
    ArrayList<Horse> horses = new ArrayList<>();

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }
    public Horse getWinner()
    {

        Horse horse=horses.get(0);
        for(Horse h1:horses)
        {
            if (h1.getDistance()>=horse.getDistance())
                horse = h1;


        }
        return horse;

    }
    public void printWinner()
    {
        System.out.println("Winner is "+getWinner().getName()+"!");
    }

    public static void main(String[] args)
    {

     game = new Hippodrome();
        Horse h1 = new Horse("ruslan",3,0);
        Horse h2 = new Horse("kairat",3,0);
        Horse h3 = new Horse("kana",3,0);
        game.getHorses().add(h1);
        game.getHorses().add(h2);
        game.getHorses().add(h3);
        game.run();
        game.printWinner();
    }
    public void print()
    {
        for (int i = 0; i <horses.size() ; i++)
        {
            horses.get(i).print();
            System.out.println();
            System.out.println();
        }
    }
    public void run()
    {
        for (int i = 0; i <100 ; i++)
        {
            move();
            print();
            try
            {
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public void move()
    {
        for (int i = 0; i <horses.size(); i++)
        {
         horses.get(i).move();

        }
    }
}
