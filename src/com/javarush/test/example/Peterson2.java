package com.javarush.test.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Руслан on 17.03.2016.
 */
public class Peterson2 implements Runnable
{
    BufferedReader reader;
    @Override
    public void run()
    {
        reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            try
            {
                String name = reader.readLine();
                if (name.equals("exit"))
                    break;
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args)
    {


    }
}
