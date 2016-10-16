package com.javarush.test.level19.lesson08.task05;

/* Дублируем текст
Считайте с консоли имя файла
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна дублировать вывод всего текста в файл, имя которого вы считали
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Закройте поток файла

Пример вывода на экран:
it's a text for testing

Пример тела файла:
it's a text for testing
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException{

        PrintStream consolestream = System.out;
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(arrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String result = arrayOutputStream.toString();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter(reader.readLine());
        writer.write(result);
        System.setOut(consolestream);
        System.out.println(result);
        reader.close();
        writer.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

