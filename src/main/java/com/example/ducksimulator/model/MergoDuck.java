package com.example.ducksimulator.model;

import com.example.ducksimulator.behavior.impl.FlyHigh;
import com.example.ducksimulator.behavior.impl.QuackLoud;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import static com.example.ducksimulator.behavior.enums.FlyBehavior.FLY_HIGH;
import static com.example.ducksimulator.behavior.enums.QuackBehavior.QUACK_LOUD;

@Entity
@DiscriminatorValue("MERGO")
public class MergoDuck extends Duck {

    public MergoDuck() {
        this.flyBehavior = new FlyHigh();
        this.quackBehavior = new QuackLoud();
        this.setFlyBehaviorType(FLY_HIGH);
        this.setQuackBehaviorType(QUACK_LOUD);
    }

    @Override
    public String display() {
        return "- Soy un Pato Mergo, mi nombre es " + this.getName() + " -";
    }
}
