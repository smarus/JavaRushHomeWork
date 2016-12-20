package com.javarush.test.level27.lesson15.big01.statistic;

import com.javarush.test.level27.lesson15.big01.kitchen.Cook;
import com.javarush.test.level27.lesson15.big01.statistic.event.CookedOrderEventDataRow;
import com.javarush.test.level27.lesson15.big01.statistic.event.EventDataRow;
import com.javarush.test.level27.lesson15.big01.statistic.event.EventType;
import com.javarush.test.level27.lesson15.big01.statistic.event.VideoSelectedEventDataRow;

import java.util.*;

/**
 * Created by ruslan on 12/11/16.
 */

public class StatisticManager
{
    private static StatisticManager instance = new StatisticManager();
    private StatisticStorage storage = new StatisticStorage();
    public static StatisticManager getInstance()
    {
        return instance;
    }
    private StatisticManager()
    {
    }
    public void register(EventDataRow data)
    {
        if (data == null) return;
        storage.put(data);
    }
    private class StatisticStorage
    {
        private Map<EventType, List<EventDataRow>> map = new HashMap<>();
        private StatisticStorage()
        {
            for (EventType e : EventType.values())
            {
                map.put(e, new ArrayList<EventDataRow>());
            }
        }
        private void put(EventDataRow data)
        {
            if (data == null) return;
            map.get(data.getType()).add(data);
        }
    }
}