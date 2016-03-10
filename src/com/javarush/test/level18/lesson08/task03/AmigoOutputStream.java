package com.javarush.test.level18.lesson08.task03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream extends FileOutputStream {
       FileOutputStream instance;
    String s ="JavaRush © 2012-2013 All rights reserved.";
    byte [] bytes =s.getBytes();
    public AmigoOutputStream(FileOutputStream stream) throws FileNotFoundException
    {
        super(fileName);
        instance = stream;
    }

    @Override
    public void write(int b) throws IOException
    {
        instance.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException
    {
        instance.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException
    {
        instance.write(b, off, len);
    }

    @Override
    public void close() throws IOException
    {
        instance.flush();
        instance.write(bytes);
        instance.close();
    }

    @Override
    protected void finalize() throws IOException
    {
        super.finalize();
    }

    @Override
    public void flush() throws IOException
    {
        instance.flush();
    }

    public static String fileName = "C:/tmp/result.txt";

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}

