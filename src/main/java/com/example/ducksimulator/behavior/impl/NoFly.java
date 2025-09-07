package com.example.ducksimulator.behavior.impl;

import com.example.ducksimulator.behavior.interfaces.IFly;

public class NoFly implements IFly {
    @Override
    public String fly() {
        return "* No puedo volar *";
    }
}
