package com.comodostudio.sandwichapp;

/**
 * Created by sarashidq on 28/10/17.
 */

public class Baguette implements Bread {

    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public String calories() {
        return " : 65 Kcal";
    }
}
