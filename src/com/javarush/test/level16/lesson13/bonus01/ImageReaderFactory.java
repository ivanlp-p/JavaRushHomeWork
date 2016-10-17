package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by User on 17.10.2016.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes image) {
        ImageReader reader;
        if (image == ImageTypes.JPG) {
            reader = new JpgReader();
        } else if (image == ImageTypes.PNG) {
            reader = new PngReader();
        } else if (image == ImageTypes.BMP) {
            reader = new BmpReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        return reader;
    }
}
