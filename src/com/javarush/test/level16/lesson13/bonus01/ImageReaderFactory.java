package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 28.10.15
 * Time: 11:58
 * To change this template use File | Settings | File Templates.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes types)
    {
        ImageReader reader=null;
       if (types==ImageTypes.JPG)
          reader=new JpgReader();
        else if (types==ImageTypes.BMP)
           reader=new BmpReader();
        else if (types==ImageTypes.PNG)
           reader= new PngReader();
        else
       {
         throw    new IllegalArgumentException("Неизвестный тип картинки");
       }
        return reader;
    }
}
