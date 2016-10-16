package com.javarush.test.level28.lesson15.big01.model;

import com.javarush.test.level28.lesson15.big01.view.View;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruslan on 16-8-20.
 */
public class Model
{
    View view;
    Provider [] providers;


    public Model(View view, Provider[] providers) throws IllegalArgumentException
    {
        if (view==null || providers==null||providers.length==0)
            throw new IllegalArgumentException();
        this.view = view;
        this.providers = providers;
    }


    public void selectCity(String city) throws IOException
    {
        List<Vacancy> list = new ArrayList<>();
        for (Provider provider:providers){
            list.addAll(provider.getJavaVacancies(city));
        }
        view.update(list);
    }

}
