package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> list = new ArrayList<>();
       String fileName = args[0];
       String secondFile = args[1];
        String name;
        String result_1="";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
        while ((name = reader.readLine()) != null)
        {
            String[] stringsArray = name.split(" ");
            for (int i = 0; i < stringsArray.length; i++) {
               if (stringsArray[i].length()>6)
                   list.add(stringsArray[i]);
            }
        }
            String result = "";
            for (int i = 0; i < list.size(); i++) {
                    if (i==list.size()-1)
                        result+=list.get(i);
                    else
                        result+=list.get(i)+",";
            }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(secondFile), "UTF-8"));
            writer.write(result);
            writer.close();
            reader.close();
        }


    }

