package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.command.CommandExecutor;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.io.IOException;
import java.util.Locale;

public class CashMachine
{

    public static final String RESOURCE_PATH = "com.javarush.test.level26.lesson15.big01.resources.";

    public static void main(String[] args) throws IOException
    {
        Locale.setDefault(Locale.ENGLISH);
        try
        {
            Operation currentOperation = null;
            do
            {
                currentOperation = ConsoleHelper.askOperation();
                CommandExecutor.execute(currentOperation);
            }
            while (currentOperation != Operation.EXIT);
        }
        catch (InterruptOperationException e)
        {
            ConsoleHelper.writeMessage("Всего доброго");
        }
    }
}
