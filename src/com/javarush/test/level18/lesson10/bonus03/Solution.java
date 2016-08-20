package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        while (bufferedReader.ready()) {
           String file = bufferedReader.readLine();
            list.add(file);
        }
        bufferedReader.close();
        if (args[0].equals("-u"))
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (int i = 0; i <list.size() ; i++)
            {
                String file = list.get(i);
                if (file.equals(""))
                continue;
            else {
                    int id = Integer.parseInt(file.substring(0, 8).replaceAll(" ", ""));
                    if (args[1].equals(id + ""))
                    {
                        String productname = args[2];
                        for (int l = 3; l < args.length - 2; l++)
                            productname += " " + args[l];
                        writer.write(String.format("%-8.8s%-30.30s%-8.8s%-4.4s%n", String.valueOf(id), productname, args[args.length - 2], args[args.length - 1]));
                    }
                    else
                        writer.write(String.format("%s%n",list.get(i)));
                }


            }
            writer.close();
        }
        else if (args[0].equals("-d"))
        {
            BufferedWriter fwriter = new BufferedWriter(new FileWriter(filename));
            for (int i = 0; i <list.size() ; i++)
            {
                String file = list.get(i);
                System.out.println(file);
                if (file.equals(""))
                    continue;
                else
                {
                    String id = file.substring(0,8).replaceAll(" ","");
                    if (!(id.equals(args[1])))
                        fwriter.write(String.format("%s%n",file));                   {
                    }


                }
            }
         fwriter.close();
        }

    }
}
