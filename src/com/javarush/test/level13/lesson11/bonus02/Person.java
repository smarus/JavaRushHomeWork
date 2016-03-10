package com.javarush.test.level13.lesson11.bonus02;

public class Person implements RepkaItem
{
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    @Override
    public String getNamePadezh()
    {
        return this.namePadezh;  //To change body of implemented methods use File | Settings | File Templates.
    }
    public void pull(Person person)
    {
        System.out.println(this.name+" за "+person.namePadezh);
    }
}
