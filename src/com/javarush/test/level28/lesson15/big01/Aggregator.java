package com.javarush.test.level28.lesson15.big01;


import com.javarush.test.level28.lesson15.big01.model.*;
import com.javarush.test.level28.lesson15.big01.view.HtmlView;

import java.io.IOException;

/**
 * Created by rus on 7/24/16.
 */
public class Aggregator
{
    public static void main(String[] args) throws IOException
    {

        Provider provider = new Provider(new HHStrategy() {
        });
        HtmlView view = new HtmlView();
        Provider provider1 = new Provider(new MoikrugStrategy());
        Model model = new Model(view,new Provider[]{provider,provider1});
        Controller controller = new Controller(model);
        view.setController(controller);
        view.userCitySelectEmulationMethod();
    }
}
