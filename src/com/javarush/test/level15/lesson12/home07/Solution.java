package com.javarush.test.level15.lesson12.home07;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Файл в статическом блоке
1. Инициализируй константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Constants.FILE_NAME все строки и добавь их по-отдельности в List lines.
3. Закрой поток ввода методом close().
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static
    {
      /*  try
        {
            FileInputStream file = new FileInputStream(Constants.FILE_NAME);


            Scanner scanner = new Scanner(file);



            while (scanner.hasNext())
            {
                String s = scanner.nextLine();
                lines.add(s);
            }
            file.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }*/

        try
        {
            BufferedReader fileReader = new BufferedReader(new FileReader(Constants.FILE_NAME));
            String data;
            while ((data = fileReader.readLine()) != null)
            {
                lines.add(data);
            }
            fileReader.close();
        }
        catch(Exception e) {}



    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
