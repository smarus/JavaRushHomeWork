package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int centerX;
    private String centerY;
    private double radius;
    public void initialize(int centerX)
    {
        this.centerX = centerX;
    }
    public void initialize(String folder, String centerY)
    {
        this.centerY = folder + centerY;
    }
    public void initialize(double radius)
    {
        this.radius = radius;
    }
    //Напишите тут ваш код

}
