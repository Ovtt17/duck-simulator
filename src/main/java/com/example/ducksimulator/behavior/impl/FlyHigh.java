package com.example.ducksimulator.behavior.impl;

import com.example.ducksimulator.behavior.interfaces.IFly;

public class FlyHigh implements IFly {
    @Override
    public String fly() {
        return "* Vuelo Alto *";
    }
}
