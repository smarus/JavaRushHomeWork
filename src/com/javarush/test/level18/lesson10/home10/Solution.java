package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> files = new ArrayList<String>();
        int index = 0;
        while (true)
        {
            String filename = reader.readLine();
            if (filename.equals("end"))
                break;
            else
            {
                files.add(filename);
                index++;
            }
        }
        String truefilename = files.get(0);
        int tamga = truefilename.indexOf(".part");
        String forOutput = truefilename.substring(0, tamga);
        FileOutputStream fileOutputStream = new FileOutputStream(forOutput,true);
        TreeMap<Integer,String> map = new TreeMap<>();
        for (int i = 0; i <files.size() ; i++)
        {
           map.put(Integer.parseInt(String.valueOf(files.get(i).charAt(files.get(i).length()-1))),files.get(i));
        }
        FileInputStream fileInputStream = null;
        for(Map.Entry<Integer,String>pair :map.entrySet())
        {
            fileInputStream= new FileInputStream(pair.getValue());
            byte [] bytes = new byte[fileInputStream.available()];
            while (fileInputStream.available()>0)
            {

                fileInputStream.read(bytes);
                fileOutputStream.write(bytes);
            }
        }

        fileInputStream.close();
        fileOutputStream.close();
        reader.close();
        }


    }

