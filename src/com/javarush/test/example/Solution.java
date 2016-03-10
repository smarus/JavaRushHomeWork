package com.javarush.test.example;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 12.11.15
 * Time: 9:36
 * To change this template use File | Settings | File Templates.
 */
public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 0; i <5 ; i++)
        {
              new Thread(new SecondThread()).start();
        }
        System.out.println("Biiti");

    }
   public static class SecondThread  implements Runnable
   {
     public  int a =10;
    public static int b =0;
    public final int c=b++;

       public String status()
       {
           return "Поток"+c+"doing";
       }
       @Override
       public void run()
       {
        while (a-->0){
            System.out.println(status());
        }
        }

       }
   }

