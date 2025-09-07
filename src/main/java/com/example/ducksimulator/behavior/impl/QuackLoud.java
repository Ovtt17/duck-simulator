package com.example.ducksimulator.behavior.impl;

import com.example.ducksimulator.behavior.interfaces.IQuack;

public class QuackLoud implements IQuack {
    @Override
    public String quack() {
        return "* Quack Fuerte *";
    }
}
