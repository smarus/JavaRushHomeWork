package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
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
    public Rectangle(int left)
    {
        this.left = left;
    }

    public Rectangle(double width)
    {
        this.width = width;
    }
    public Rectangle(String top)
    {
        this.top = top;
    }
    public Rectangle(char height)
    {
        this.height = height;
    }
    //Напишите тут ваш код

}
