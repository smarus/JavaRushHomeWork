package com.javarush.test.example;

import java.io.*;


/**
 * Created by Руслан on 15.05.2016.
 */

import java.io.*;
import java.util.Scanner;


public class Main{
    public static void main(String[] argv) throws IOException{
        new Main().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("/home/ruslan/input.txt"));
        int a=sc.nextInt();
        int b=sc.nextInt();
        char [][] color = new char[a][b];
        int  [][] tablo = new int[a][b];

        pw = new PrintWriter(new File("/home/ruslan/output.txt"));
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <b ; j++) {
                color[i][j] = sc.next().charAt(0);
                System.out.print(color[i][j]+"  ");
            }
            System.out.println();
        }
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <b ; j++) {
                tablo[i][j] = sc.nextInt();
            }
        }
        boolean flagCheck = true;
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <b ; j++) {
                System.out.println(tablo[i][j]);
            }
        }

        pw.println();
        pw.close();
    }
}