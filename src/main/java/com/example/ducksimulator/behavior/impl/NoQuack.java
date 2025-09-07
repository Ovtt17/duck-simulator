package com.example.ducksimulator.behavior.impl;

import com.example.ducksimulator.behavior.interfaces.IQuack;

public class NoQuack implements IQuack {
    @Override
    public String quack() {
        return "* No hace sonido *";
    }
}
