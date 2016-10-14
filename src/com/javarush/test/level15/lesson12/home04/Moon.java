package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Ivan on 16.03.2016.
 */
public class Moon implements Planet
{
    private static Moon intance;

    private Moon(){}

    public static Moon getInstance(){
        if (intance == null){
            intance = new Moon();
        }
        return intance;
    }
}
