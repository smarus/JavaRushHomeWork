package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException{
        TreeMap<Double,String> map = new TreeMap<Double, String>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line  = null;
        while ((line = reader.readLine())!=null)
        {
           String [] symbols = line.split(" ");
            map.put(Double.parseDouble(symbols[1]),symbols[0]);
        }
        System.out.println(map.get(map.lastKey()));
        reader.close();


    }
}
