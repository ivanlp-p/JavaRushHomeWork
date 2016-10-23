package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filepath1 = reader.readLine();
        String filepath2 = reader.readLine();

        reader.close();

        FileInputStream inputStream = new FileInputStream(filepath1);
        FileOutputStream outputStream = new FileOutputStream(filepath2);

        if (inputStream.available() > 0)
        {
            byte[] buffer = new byte[inputStream.available()];
            byte[] bufferRevers = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            for (int i = 0; i < count; i++)
            {
                bufferRevers[i] = buffer[count - (i + 1)];
            }

            outputStream.write(bufferRevers);

        }

        inputStream.close();
        outputStream.close();
    }
}