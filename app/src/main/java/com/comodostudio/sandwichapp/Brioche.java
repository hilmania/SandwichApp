package com.comodostudio.sandwichapp;

/**
 * Created by sarashidq on 28/10/17.
 */

public class Brioche implements Bread {

    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public String calories() {
        return " : 85 kcal";
    }
}
