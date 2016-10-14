package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    public Money(double amount)
    {
        money = amount;
    }

    private double money;

    public double getAmount(){
        return money;
    };

    public abstract String getCurrencyName();
}

