package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filepath = "";

        int count = 1001;
        while (count > 1000){
            try
            {
                filepath = reader.readLine();
                FileInputStream inputStream = new FileInputStream(filepath);

                if (inputStream.available() > 0) {
                    byte[] buffer = new byte[inputStream.available()];
                    count = inputStream.read(buffer);
                }

                if (count < 1000) {
                    reader.close();
                    inputStream.close();

                    throw new DownloadException();
                }
            } catch (IOException e) {

            }
        }
    }

    public static class DownloadException extends Exception{

    }
}
