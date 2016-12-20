package com.javarush.test.example.artificialIntelegence;

/**
 * Created by ruslan on 11/25/16.
 */
public class Web {

        public int[][] mul; // Тут будем хранить отмасштабированные сигналы
        public int[][] weight; // Массив для хранения весов
        public int[][] input; // Входная информация
        public int limit = 9; // Порог - выбран экспериментально, для быстрого обучения
        public int sum ; // Тут сохраним сумму масштабированных сигналов

        public Web(int sizex, int sizey,int[][] inP) // Задаем свойства при создании объекта
        {
            weight = new int[sizex] [sizey]; // Определяемся с размером массива (число входов)
            mul = new int[sizex] [sizey];

            input = new int[sizex] [sizey];
            input = inP; // Получаем входные данные
        }
    public void mul_w()
    {
        for (int x = 0; x <= 2; x++)
        {
            for (int y = 0; y <= 4; y++) // Пробегаем по каждому аксону
            {
                mul[x][y] = input[x][y]*weight[x][y]; // Умножаем его сигнал (0 или 1) на его собственный вес и сохраняем в массив.
            }
        }
    }

    public void Sum()
    {
        sum = 0;
        for (int x = 0; x <= 2; x++)
        {
            for (int y = 0; y <= 4; y++)
            {
                sum += mul[x] [y];
            }
        }
    }
}
