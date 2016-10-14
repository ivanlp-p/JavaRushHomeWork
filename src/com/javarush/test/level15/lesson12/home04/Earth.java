package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Ivan on 16.03.2016.
 */
public class Earth implements Planet
{
    private static Earth intance;

    private Earth(){}

    public static Earth getInstance(){
        if (intance == null){
            intance = new Earth();
        }
        return intance;
    }
}
