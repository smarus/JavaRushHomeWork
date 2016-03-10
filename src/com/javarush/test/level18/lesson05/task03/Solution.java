package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/
 import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3= reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filename1);
       FileOutputStream fileOutputStream1 = new FileOutputStream(filename2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(filename3);
        int count = fileInputStream.available();
        if (count%2==0){
            byte []massiv1 = new byte[count];

            fileInputStream.read(massiv1);
            for(byte b:massiv1)
                System.out.println((char)(b));
            byte []masmini1 = new byte[count/2];
            byte []masmini2 = new byte[count/2];
            for (int i = 0; i <count/2 ; i++)
            {
               masmini1[i] = massiv1[i];
            }
            for (int i = 0; i <count/2; i++)
            {
             masmini2[i] = massiv1[i+count/2];
            }
            fileOutputStream1.write(masmini1);
            fileOutputStream2.write(masmini2);
        }
        else {
            byte []massiv1 = new byte[count];

            fileInputStream.read(massiv1);
            byte []masmini1 = new byte[(count+1)/2];
            byte []masmini2 = new byte[(count-1)/2];
            for (int i = 0;i <((count+1)/2) ; i++)
            {
                masmini1[i] = massiv1[i];

            }
            int k =0;
            for (int i = (count+1)/2; i <count; i++)
            {
                masmini2[k] = massiv1[i];
                k++;
            }
            fileOutputStream1.write(masmini1);
            fileOutputStream2.write(masmini2);
        }
        fileInputStream.close();
        reader.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
        }

    }


