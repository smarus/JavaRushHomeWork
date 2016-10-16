package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
        this.name=name;
        this.weight=weight;
        this.strength=strength;

    }

    public boolean fight (Cat anotherCat)
    {
        boolean m=true;
        if (this.strength>=anotherCat.strength&&this.weight>=anotherCat.weight&&this.age>=anotherCat.age)
            m=true;
        if (anotherCat.strength>=this.strength&&anotherCat.weight>=this.weight&&anotherCat.age>=this.age)
            m=false;
        if(m)
            return true;
        else
            return false;
        //Напишите тут ваш код

    }

    public static void main(String[] args)
    {
        Cat cat1= new Cat();
        Cat cat2 = new Cat();
        cat1.weight=10;
        cat1.age=2;
        cat1.strength=20;
        cat2.age=8;
        cat2.strength=18;
        cat2.weight=8;
      /*  if (cat2.fight(cat1))
        System.out.println("Ruslan");
        else
        System.out.println("Nurlan");
        */

    }
}
