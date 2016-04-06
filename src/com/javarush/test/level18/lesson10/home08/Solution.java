package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String s = reader.readLine();
            if (s.equals("exit"))
                break;
            else
            {
                new ReadThread(s).start();
            }


        }
       // System.out.println((char)50);
        reader.close();

//        for (Map.Entry<String,Integer> pair:resultMap.entrySet())
//        {
//            System.out.println(pair.getKey()+"  "+pair.getValue());
//        }

    }

    public static class ReadThread extends Thread {
        String filename;
        ArrayList<Integer> list = new ArrayList<Integer>();
        public ReadThread(String fileName) {
            //implement constructor body
            this.filename = fileName;
        }


        @Override
        public void run()
        {
            try
            {
                FileReader fileReader = new FileReader(filename);
                while (fileReader.ready())
                {
                    list.add(fileReader.read());
                }
                int index=0;
                int max = Integer.MIN_VALUE;
                for (int i = 0; i <list.size(); i++)
                {
                    int kol=0;
                    for (int j = 0; j <list.size() ; j++)
                    {
                        if (list.get(i)==list.get(j))
                        {
                            kol++;
                        }
                    }
                    if (kol>max)
                    {
                        max =kol;
                        index = i;
                    }
                }
                synchronized (resultMap)
                {
                    resultMap.put(filename, list.get(index));
                }
                fileReader.close();
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}