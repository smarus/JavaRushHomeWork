package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        String kluch=args[0];
        String filename=args[1];
        FileInputStream fileInputStream =new FileInputStream(filename);
        String fileOutput=args[2];
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutput);
        ArrayList<Integer>list = new ArrayList<Integer>();
        if (kluch.equals("-e"))
        {

            while (fileInputStream.available()>0)
            {
               list.add(fileInputStream.read()+10);
            }

            for (int i = 0; i < list.size() ; i++)
            {
                fileOutputStream.write(list.get(i));
            }

        }
        else if (kluch.equals("-d"))
        {
            while (fileInputStream.available()>0)
            {
                list.add(fileInputStream.read()-10);
            }
            for (int i = 0; i <list.size() ; i++)
            {
               fileOutputStream.write(list.get(i));
            }
        }
        fileInputStream.close();
        fileOutputStream.close();

    }

}
