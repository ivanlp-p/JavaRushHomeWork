package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String stDelim = "?,&,=";
        List<String> list = new ArrayList<>();
        String strValue = null;
        double dblValue = 0;



        StringTokenizer stringTokenizer = new StringTokenizer(url,stDelim,true);

        while (stringTokenizer.hasMoreTokens()){
            String delim;
            delim = stringTokenizer.nextToken();

            if (delim.equals("?") || delim.equals("&")){

                list.add((String) stringTokenizer.nextElement());

                if (list.get(list.size()-1).equals("obj")){

                    delim = stringTokenizer.nextToken();

                    if (delim.equals("=")){
                        String value = (String) stringTokenizer.nextElement();

                        if (isDouble(value)){
                            dblValue = Double.parseDouble(value);
                        } else {
                            strValue = value;

                        }

                    }

                }

            }
        }

        for (String s : list)
        {
            System.out.print(s + " ");
        }
        System.out.print("\n");
        if (strValue != null){
            alert(strValue);
        } else if (dblValue != 0){
            alert(dblValue);
        }

    }

    public static boolean isDouble (String s){

        Pattern p = Pattern.compile("(\\d*\\.?\\d+)");
        Matcher m = p.matcher(s);

        return m.matches();
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
