package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));


        FileWriter writer = new FileWriter(r.readLine());


        while (true)
        {
            String s=r.readLine();
            if (s.equals("exit"))
            {
                s = s + "\r\n";
                writer.write(s);
                break;
            }


            s = s + "\r\n";

            writer.write(s);

        }

        writer.close();
    }
}
