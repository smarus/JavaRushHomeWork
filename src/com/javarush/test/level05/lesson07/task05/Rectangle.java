package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int left;
    private String top;
    private double width;
    private  char   height;
    public void initialize(int left)
    {
        this.left = left;
    }

    public void initialize(double width)
    {
        this.width = width;
    }
    public void initialize(String top)
    {
        this.top = top;
    }
    public void initialize(char height)
    {
        this.height = height;
    }





    //Напишите тут ваш код

}
