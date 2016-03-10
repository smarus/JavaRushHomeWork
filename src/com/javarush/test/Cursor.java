package com.javarush.test;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 21.11.15
 * Time: 6:42
 * To change this template use File | Settings | File Templates.
 */
public class Cursor
{

        static int  count = 2;
        public static int getCount()
        {
            return count;
        }
        public static void main(String[] args)
        {

            int []a = new int [5];
            for(int i=0;i<5;i++)
            {
                a[i]=0;
            }
            System.out.println(a[getCount()]++);
        }
    }

