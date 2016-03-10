package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int []a ={1,2,3,4,5};
        int []b = {2,3};
        int []c = {1,2,3,4};
        int []d ={1,2,3,4,5,6,7};
        int []f = {};
        ArrayList<int[]>list = new ArrayList<int[]>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(f);
        //напишите тут ваш код
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
