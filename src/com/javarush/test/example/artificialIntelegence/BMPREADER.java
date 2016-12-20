package com.javarush.test.example.artificialIntelegence;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by ruslan on 12/2/16.
 */
public class BMPREADER {
    public static void main(String[] args) throws IOException {

        BufferedImage img = ImageIO.read(new File("/home/ruslan/paint.jpg"));
        // you should stop here
        byte[][] green = new byte[100][100];
        byte[][] blue = new byte[100][100];
        byte[][] red = new byte[100][100];
        byte[][] alpha = new byte[100][100];
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                int color = img.getRGB(x, y);
                alpha[x][y] = (byte)(color>>24);
                red[x][y] = (byte)(color>>16);
                green[x][y] = (byte) (color >> 8);
                blue[x][y] = (byte)(color);
                int rgb = (red[x][y]<<16)  | (green[x][y]<<8)  | blue[x][y];
                System.out.print(rgb);
            }
            System.out.println();
        }
        byte[][] inputData = green;


    }
}
