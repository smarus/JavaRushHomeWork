package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/**
 * JavaRush.ru

 */
public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> people = new HashMap<String, String>();

        people.put( "Ivanov", "Ivan" );
        people.put( "Petrov", "Petr" );
        people.put( "Sidorov", "Ivan" );
        people.put( "Semenov", "Sergey" );
        people.put( "Frolov", "Igor" );
        people.put( "Sergeev", "Igor" );
        people.put( "Kostenko", "Alexey" );
        people.put( "Petrenko", "Sergey" );
        people.put( "Dmitriev", "Sergey" );
        people.put( "Nikonov", "Petr" );

        return people;
    }

    public static void removeTheFirstNameDuplicates( HashMap<String, String> map )
    {
        Set<String> setNames = new HashSet<String>();
        Set<String> duplicateNames = new HashSet<String>();

        for ( Map.Entry<String, String> pair : map.entrySet() )
        {
            String name = pair.getValue();

            if ( setNames.contains( name ) )
            {
                duplicateNames.add( name );
            }
            else
            {
                setNames.add( name );
            }
        }

        for ( String name : duplicateNames )
        {
            removeItemFromMapByValue( map, name );
        }
    }

    public static void removeItemFromMapByValue( HashMap<String, String> map, String value )
    {
        HashMap<String, String> copy = new HashMap<String, String>( map );
        for ( Map.Entry<String, String> pair : copy.entrySet() )
        {
            if ( pair.getValue().equals( value ) )
            {
                map.remove( pair.getKey() );
            }
        }
    }

    public static void main( String[] args )
    {
        HashMap<String, String> map = createMap();

        removeTheFirstNameDuplicates( map );
    }
}