package com.javarush.test.example;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ruslan on 10/19/16.
 */
public class Main2 {
    Scanner sc;
    public static void main(String[] args) throws IOException {
        new Main2().run();
    }
    public void run() throws IOException {
        sc = new Scanner(System.in);
        String time = sc.nextLine();
        int[] times = new int[2];
        times[0] = Integer.parseInt(time.split(":")[0]);
        times[1] = Integer.parseInt(time.split(":")[1]);
        int hours = times[0] ;
        int minute1 = times[1];
        int minute2 = Integer.parseInt(sc.nextLine());
        int summa = hours * 60 + minute1 + minute2;
        summa %= 24 * 60;
        int hour = summa/60;
        int min = summa%60;


        if (hour<10){
            if (min<10)
            System.out.println("0"+hour+":"+"0"+min);
            else
                System.out.printf("0"+hour+":"+min);
        }
        else {
            if (min<10){
                System.out.println(hour+":"+"0"+min);
            }
            else
                System.out.println(hour+":"+min);

        }



    }
}
