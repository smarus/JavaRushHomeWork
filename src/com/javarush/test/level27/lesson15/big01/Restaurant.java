package com.javarush.test.level27.lesson15.big01;


import com.javarush.test.level27.lesson15.big01.kitchen.Cook;
import com.javarush.test.level27.lesson15.big01.kitchen.Waitor;

public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(5);
        Cook amigo = new Cook("Amigo");
        Waitor waitor = new Waitor();
        amigo.addObserver(waitor);
        tablet.addObserver(amigo);
        tablet.createOrder();
        Cook cook2=new Cook("mAmigo");
        Tablet tablet2=new Tablet(5);
        Waitor waiter2=new Waitor();
        cook2.addObserver(waiter2);
        tablet2.addObserver(cook2);
        tablet2.createOrder();
        Cook cook3=new Cook("Am");
        Tablet tablet3=new Tablet(5);
        Waitor waiter3=new Waitor();
        cook3.addObserver(waiter3);
        tablet3.addObserver(cook3);
        tablet3.createOrder();
    }
}