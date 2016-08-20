package com.javarush.test.level21.lesson16.big01;

/**
 * Created by Руслан on 26.04.2016.
 */
public class Horse
{
    String name;
    double distance;
    double speed;
    public void move()
    {
      distance +=(speed*Math.random());
    }
    public void print()
    {
        String s="";
        for (int i = 0; i <((int)distance) ; i++)
        {
         s +=".";
        }
        System.out.println(s+this.getName());
    }

    public Horse(String name, double speed, double distance)
    {
        this.name = name;
        this.distance = distance;
        this.speed = speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public String getName()
    {
        return name;
    }

    public double getDistance()
    {
        return distance;
    }

    public double getSpeed()
    {
        return speed;
    }
}
