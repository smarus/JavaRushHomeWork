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
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> files = new ArrayList<String>();
        String fileName;

        while (!(fileName = reader.readLine()).equals("end"))
            files.add(fileName);

        reader.close();
        Collections.sort(files);

        String [] truefilename = files.get(0).split(".part");
        String forOutput = truefilename[0];

        FileOutputStream fileOutputStream = new FileOutputStream(forOutput,true);
        for(String afilename:files)
        {
         FileInputStream  fileInputStream= new FileInputStream(afilename);
          byte[]  bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            fileInputStream.close();
            fileOutputStream.write(bytes);
        }
       fileOutputStream.close();
        }
    }

