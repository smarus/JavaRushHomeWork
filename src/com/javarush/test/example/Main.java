package com.javarush.test.example;




/**
 * Created by Руслан on 15.05.2016.
 */
import java.io.*;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws IOException{
        new Main().run();
    }
    Scanner sc;
    public void run() throws IOException {
        sc = new Scanner(System.in);
        String time = sc.nextLine();

        String regular = "%d:%d";
        int[] times = new int[2];
        times[0] = Integer.parseInt(time.split(":")[0]);
        times[1] = Integer.parseInt(time.split(":")[1]);
        int hours = times[0] * 60;
        int minute1 = times[1];
        int minute2 = Integer.parseInt(sc.nextLine())%1440;
        int summa = hours + minute1 + minute2;
       int commonHours = summa/60;
//        if (commonHours>24)
//            commonHours = commonHours-24;
        if (commonHours == 24) {
            if (summa % 60 < 10) {
                System.out.println("00:" + "0" + summa % 60);
            } else {
                System.out.println("00:" + summa % 60);
            }
        } else if (commonHours< 10) {
            if (summa % 60 < 10) {
                System.out.println("0" +  commonHours + ":0" + summa % 60);
            } else {
                System.out.println("0" + commonHours + ":" + summa % 60);
            }
        } else if (summa / 60 > 24) {
            if (summa % 60 < 10) {
                System.out.println("00:" + "0" + summa % 60);
            } else {
                System.out.println("00:" + summa % 60);
            }
        }
       else{
           if (summa%60<10)
               System.out.println(commonHours+":0"+summa%60);
           else
               System.out.println(commonHours+":"+summa%60);
       }


    }
}