package com.comodostudio.sandwichapp;

/**
 * Created by sarashidq on 28/10/17.
 */

public abstract class AbstractFactory {

    abstract Bread getBread(String bread);
    abstract Filling getFilling(String filling);
}
