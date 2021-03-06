package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandfather1 = new Human("DOg",true,72,null,null);
        Human grandfather2 = new Human("John",true,78,null,null);
        Human grandmother1 = new Human("Alisa",false,72,null,null);
        Human grandmother2 = new Human("Feruza",false,78,null,null);
        Human father = new Human("fedor",true,45,grandfather1,grandmother1);
        Human mother = new Human("anna",false,43,grandfather2,grandmother2);
        Human child1 = new Human("sa",true,32,father,mother) ;
        Human child2 = new Human("sa",true,33,father,mother);
        Human child3 = new Human("sa",false,34,father,mother);
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;
        //напишите тут ваш код
        Human(String name,boolean sex,int age,Human father ,Human mother)
        {
            this.name = name;
            this.sex=sex;
            this.age = age;
            this.father = father;
            this.mother = mother;


        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
