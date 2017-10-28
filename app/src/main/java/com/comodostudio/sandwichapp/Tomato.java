package com.comodostudio.sandwichapp;

/**
 * Created by sarashidq on 28/10/17.
 */

public class Tomato implements Filling {
    @Override
    public String name() {
        return "Tomato";
    }

    @Override
    public String calories() {
        return " : 65 kcal";
    }
}
