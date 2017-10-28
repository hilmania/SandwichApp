package com.comodostudio.sandwichapp;

/**
 * Created by sarashidq on 28/10/17.
 */

public class Roll implements Bread {

    @Override
    public String name() {
        return "Roll";
    }

    @Override
    public String calories() {
        return " : 75 kcal";
    }
}
