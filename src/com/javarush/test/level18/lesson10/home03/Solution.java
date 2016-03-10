package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[] files=new String[3];
        files[0]=bufferedReader.readLine();
        files[1]=bufferedReader.readLine();
        files[2]=bufferedReader.readLine();
        bufferedReader.close();
        FileOutputStream outputStream=new FileOutputStream(files[0],true);
        FileInputStream inputStream1=new FileInputStream(files[1]);
        FileInputStream inputStream2=new FileInputStream(files[2]);
        while (inputStream1.available()>0){
            int data=inputStream1.read();
            outputStream.write(data);
        }
        while (inputStream2.available()>0){
            int data=inputStream2.read();
            outputStream.write(data);
        }
        inputStream1.close();
        inputStream2.close();
        outputStream.close();
    }
}
