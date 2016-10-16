package com.javarush.test.level28.lesson15.big01;

import com.javarush.test.level28.lesson15.big01.model.Model;
import com.javarush.test.level28.lesson15.big01.model.Provider;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rus on 7/24/16.
 */
public class Controller
{
    Model model;

    public Controller(Model model)
    {
        if (model==null)
            throw new IllegalArgumentException("IllegalArgumentException");
        this.model = model;
    }
    public void onCitySelect(String cityName) throws IOException
    {
        model.selectCity(cityName);
    }

}
