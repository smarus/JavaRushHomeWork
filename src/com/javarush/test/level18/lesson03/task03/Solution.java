package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Byte,Integer> letters = new HashMap<Byte, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        FileInputStream in = new FileInputStream(new File(file));
        byte[] buffer = new byte[in.available()];
        if (in.available() > 0) {
            in.read(buffer);
        }
        in.close();
        for(byte c:buffer) {
            int count = 0;
            for(byte c1:buffer)
            {
                if(c == c1)
                    count++;
            }
            letters.put(c, count);
        }
        int Maxbyte = 0;
        for(Map.Entry<Byte, Integer> pair :letters.entrySet())
        {
            if (pair.getValue() > Maxbyte)
                Maxbyte = pair.getValue();
        }
        for(Map.Entry<Byte, Integer> pair :letters.entrySet())
        {
            if (pair.getValue().equals(Maxbyte))
                System.out.print(pair.getKey()+ " ");
        }
    }
}