package com.javarush.test.example;

import java.io.IOException;

/**
 * Created by Руслан on 03.12.2015.
 */
public class Main {

    // указываем путь к файлу с которым мы будем работать
    private static final String PATH = "C:\\rus\\data.txt";
    // создаем экземпляр нашего класса который мы создали в первом шаге
    private static FileInputOutputStream streamExam;

    public static void main(String... args) throws IOException
    {
        // инициализируем наш класс для работы с файлом
        streamExam = new FileInputOutputStream(PATH);

        // вызываем метод чтения файла
        streamExam.read();

        // вызываем метод записи в файл
        streamExam.write("Hello DevColibri!");
    }

}