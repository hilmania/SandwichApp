package com.comodostudio.sandwichapp;

/**
 * Created by sarashidq on 28/10/17.
 */

public class BreadFactory extends AbstractFactory{

    @Override
    Bread getBread(String bread) {
        if (bread == "null") {
            return null;
        }
        if (bread == "BAG") {
            return new Baguette();
        } else if (bread == "BRI") {
            return new Brioche();
        }

        return null;
    }

    @Override
    Filling getFilling(String filling) {
        return null;
    }
}
