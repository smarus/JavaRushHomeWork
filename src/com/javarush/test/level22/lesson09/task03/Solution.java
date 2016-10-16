package com.javarush.test.level22.lesson09.task03;

import java.util.Arrays;
import java.util.Collections;

/* Составить цепочку слов
В методе main считайте с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставить все слова в таком порядке,
чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
В файле не обязательно будет много слов.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
*/
public class Solution {
    public static boolean isOk=false;
    public static void main(String[] args) {
        //...
        String word= "Киев Нью-Йорк Амстердам Вена Мельбурн";

        StringBuilder result = getLine(word.split(" "));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words)
    {

        StringBuilder sb = new StringBuilder();

        while (isOk != true)
        {
            int flag = 0;
            Collections.shuffle(Arrays.asList(words));
            sb.append(words[0] + " ");
            for (int i = 1; i < words.length; i++) {
                if (equalsTwoStrings(words[i-1], words[i])){
                    sb.append(words[i]+" ");
                    flag++;
                }
                else {
                    break;
                }
            }
            boolean durse = false;
            if (flag==words.length-1){
                for (int i = 0; i <words.length-1 ; i++) {
                    if (equalsTwoStrings(words[i],words[i+1])) {
                        continue;
                    }
                    else {
                        break;

                    }

                }
            }
            else {
                sb = new StringBuilder();
            }

        }
        return sb;
    }
    public static boolean equalsTwoStrings(String word,String word1){
        if (word.toLowerCase().toCharArray()[0]==word1.toLowerCase().
                toCharArray()[word1.toCharArray().length-1]){
            return true;
        }
        return false;
    }

}
