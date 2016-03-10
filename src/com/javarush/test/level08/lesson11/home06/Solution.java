package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> children2= new ArrayList<Human>();
        Human child1 = new Human("Ruslan",true,22,new ArrayList<Human>());
        children2.add(child1);
        Human child2 = new Human("Nurlan",true,20,new ArrayList<Human>());
        children2.add(child2);
        Human child3 = new Human("Amir",true,6,new ArrayList<Human>());
        children2.add(child3);
        Human father = new Human("Abdrashid",true,50,children2);
        Human mother = new Human("Elnura",false,40,children2);
        //напишите тут ваш код
        ArrayList<Human> children1 = new ArrayList<Human>();
        ArrayList<Human> children12 = new ArrayList<Human>();
        children1.add(father);
        children12.add(mother);
        Human grandfather = new Human("Abdibakas",true,78,children1);
        Human grandmother = new Human("Niskan",false,74,children1);
        Human grandfather2 = new Human("Toktobek",true,34,children12);
        Human grandmother2 = new Human("Tursunai",false,70,children12);
        System.out.println(grandfather);
        System.out.println(grandfather2);
        System.out.println(grandmother);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
      Human(String name,boolean sex,int age,ArrayList<Human>children)
      {
          this.name=name;
          this.sex = sex;
          this.age = age;
          this.children = children;

      }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
