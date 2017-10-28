package com.comodostudio.sandwichapp;

/**
 * Created by sarashidq on 28/10/17.
 */

public class FillingFactory extends AbstractFactory {

    @Override
    Bread getBread(String bread) {
        return null;
    }

    @Override
    Filling getFilling(String filling) {

        if (filling == null) {
            return null;
        }

        if (filling == "CHE") {
            return new Cheese();
        } else if (filling == "TOM") {
            return new Tomato();
        }

        return null;
    }
}
