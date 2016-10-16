package com.javarush.test.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Руслан on 07.02.2016.
 */
public class Format
{
    public static void main(String[] args)
    {
        String chynara ="3fadfal";
        Pattern p = Pattern.compile(".*\\d.*");
        Matcher matcher =p.matcher(chynara);
        System.out.println(matcher.matches()==false?"ruslan":"chinara");
        System.out.println(chynara);
    }
}
