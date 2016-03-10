package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        String filename2 = reader.readLine();
        FileReader fileReader = new FileReader(filename);
        String s ="";
        while (fileReader.ready())
        {
           s += (char)fileReader.read();
        }
        String s1 = s.replace(".","!");
        FileWriter writer = new FileWriter(filename2);
        writer.write(s1);
        reader.close();
        fileReader.close();
        writer.close();
    }
}
