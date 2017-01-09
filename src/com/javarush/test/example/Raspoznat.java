package com.javarush.test.example;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by ruslan on 11/25/16.
 */
public class Raspoznat {
    double [] enters =
            {0,0,0,0,1,
             1,0,0,0,1,
             1,1,1,1,1,
             0,0,0,0,1,
             0,0,0,0,1};
//    double [] enters =
//            {       0,0,0,0,1,
//                    0,0,0,0,1,
//                    0,0,0,0,1,
//                    0,0,0,0,1,
//                    0,0,0,0,1};

//    double [] enters =
//            {       1,1,1,1,1,
//                    0,0,0,0,1,
//                    0,0,0,0,1,
//                    0,0,0,0,1,
//                    0,0,0,0,1};
    double [] neiron;
    double [] wEO;
    double minimum = 20;

    double [][] patterns ={
                   {0,0,0,0,1,
                    0,0,0,1,1,
                    0,0,1,0,1,
                    0,0,0,0,1,
                    0,0,0,0,1},

                   {1,1,1,1,1,
                    0,0,0,0,1,
                    1,1,1,1,1,
                    1,0,0,0,0,
                    1,1,1,1,1},


                   {1,1,1,1,1,
                    0,0,0,0,1,
                    1,1,1,1,1,
                    0,0,0,0,1,
                    1,1,1,1,1},

                   {1,0,0,0,1,
                    1,0,0,0,1,
                    1,1,1,1,1,
                    0,0,0,0,1,
                    0,0,0,0,1}
    };

    double [] answers = {1,2,3,4};
    double [] errors = {1,2,3,4};

    Raspoznat(){
        neiron = new double[answers.length];
        wEO = new double[enters.length];
        initWes();
        countOuter();
        study();
    }

    public void initWes(){
        for (int i=0;i<wEO.length;i++ ){
            wEO[i]=Math.random()*0.3+0.1;
        }
    }

    public void countOuter(){
        double gError=0;
        for (int i=0;i<answers.length;i++){
            System.out.println("На входе нейрона: ");
            for (int j=0; j<enters.length;j++){
                neiron[i]+=enters[j]*wEO[i];
                answers[i]+=patterns[i][j]*wEO[i];
                System.out.print(enters[j] + " ");
            }
            System.out.println();
            System.out.println("Правильное значение нейрона: "+answers[i]);
            System.out.println("Получившееся значение нейрона: "+neiron[i]);
            System.out.println();
        }
    }


    public void study(){
        double Error=0;    // Ошибка
        for (int i=0; i<patterns.length; i++)
        {answers[i]=0;
            for (int j=0; j<patterns[0].length;j++)
            {
                answers[i]+=patterns[i][j]*wEO[i];
            }
        }
        for (int i=0; i<patterns.length; i++){
            Error=answers[i]-neiron[i];
            errors[i] = Math.abs(Error);
            System.out.println("Ошибка по нейрону: "+Math.abs(Error));
            if (Math.abs(Error)<minimum)
                minimum = Math.abs(Error);
        }




    }
    public void naiti() {
        for (int i = 0; i <errors.length ; i++) {
            if (minimum == errors[i]){
                System.out.println("Это число похожа на "+(i+1));
            }
        }
    }

    public static void main(String[] args) {
        Raspoznat Ras= new Raspoznat();
        Ras.naiti();
    }
}