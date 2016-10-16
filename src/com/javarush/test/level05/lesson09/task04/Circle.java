package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{     private int centerX;
    private String centerY;
    private double radius;
    public Circle(int centerX)
    {
        this.centerX = centerX;
    }
    public Circle(String folder, String centerY)
    {
        this.centerY = folder + centerY;
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    //Напишите тут ваш код

}
