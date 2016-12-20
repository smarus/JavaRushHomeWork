package com.javarush.test.example.artificialIntelegence;

/**
 * Created by ruslan on 12/2/16.
 */

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class JavaWalkBufferedImageTest1 extends Component {


    public static void main(String[] foo) {
        new JavaWalkBufferedImageTest1();
    }

    public void printPixelARGB(int pixel) {
        int alpha = (pixel >> 24) & 0xff;
        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = (pixel) & 0xff;
        System.out.println("argb: " + alpha + ", " + red + ", " + green + ", " + blue);
        String color = String.format("#%06X",0xFFFFFF & argb(alpha,red,green,blue));
        if (color.equals(Color.GREEN))
        System.out.println(String.format("#%06X",0xFFFFFF & argb(alpha,red,green,blue)));
    }

    private void marchThroughImage(BufferedImage image) {
        int w = image.getWidth();
        int h = image.getHeight();
        System.out.println("width, height: " + w + ", " + h);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.println("x,y: " + j + ", " + i);
                int pixel = image.getRGB(j, i);
                printPixelARGB(pixel);
                System.out.println("");
            }
        }
    }

    public JavaWalkBufferedImageTest1() {
        try {
            // get the BufferedImage, using the ImageIO class
            BufferedImage image =
                    ImageIO.read(new File("/home/ruslan/1.jpg"));
            marchThroughImage(image);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public  int argb(int alpha, int red, int green, int blue) {
        return (alpha << 24) | (red << 16) | (green << 8) | blue;
    }


}