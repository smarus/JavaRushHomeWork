package com.javarush.test.level16;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 29.10.15
 * Time: 17:35
 * To change this template use File | Settings | File Templates.
 */
public class Example
{


        public static void main(String[] args) throws InterruptedException
        {
            SecondT t1 = new SecondT();
            Thread t = new Thread(t1);
            t.start();
            t.join();
            t.interrupt();
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");


        }
        public static class SecondT implements Runnable
        {
            public void run()
            {

                    System.out.println("The second thread");
                System.out.println("The second thread");
                System.out.println("The second thread");System.out.println("The second thread");
                System.out.println("The second thread");
                System.out.println("The second thread");
                System.out.println("The second thread");




            }
        }
    }

