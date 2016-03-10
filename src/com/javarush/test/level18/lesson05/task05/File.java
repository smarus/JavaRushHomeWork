package com.javarush.test.level18.lesson05.task05;

/**
 * Created by Руслан on 03.12.2015.
 */
import java.io.*;
public class File
{
    public static void main(String[] args) throws IOException
    {
                 FileInputStream fileInputStream = new FileInputStream("C:/rus/data.txt");
                while (fileInputStream.available()>0)
                {
                 int count= fileInputStream.read();
                    System.out.println(count);
                }
        fileInputStream.close();
    }
}