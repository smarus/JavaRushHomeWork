package com.javarush.test.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Peterson implements Runnable
{

    private static boolean[] in = {false, false};
    private static volatile int turn = -1;

    public static void main(String[] args)
    {
        new Thread(new Peterson(0), "Thread - 0").start();
        new Thread(new Peterson(1), "Thread - 1").start();
    }

    private final int id;

    public Peterson(int i)
    {
        id = i;
    }

    private int other()
    {
        return id == 0 ? 1 : 0;
    }

    @Override
    public void run()
    {
        in[id] = true;
        turn = other();
        boolean flag=false;
        while (in[other()] && turn == other())
        {
            System.out.println("[" + id + "] - Waiting...");
        }
        System.out.println("[" + id + "] - Working ("
                + ((!in[other()]) ? "other done" : "my turn") + ")");
        in[id] = false;
    }
}