package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Ivan on 16.03.2016.
 */
public class Sun implements Planet
{
    private static Sun intance;

    private Sun(){}

    public static Sun getInstance(){
        if (intance == null){
            intance = new Sun();
        }
        return intance;
    }
}
