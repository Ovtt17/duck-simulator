package com.example.ducksimulator.model;

import com.example.ducksimulator.behavior.impl.NoFly;
import com.example.ducksimulator.behavior.impl.QuackLoud;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import static com.example.ducksimulator.behavior.enums.FlyBehavior.NO_FLY;
import static com.example.ducksimulator.behavior.enums.QuackBehavior.QUACK_LOUD;

@Entity
@DiscriminatorValue("RUBBER")
public class RubberDuck extends Duck {

    public RubberDuck() {
        // Rubber ducks don't fly but they quack loudly
        this.flyBehavior = new NoFly();
        this.quackBehavior = new QuackLoud();
        this.setFlyBehaviorType(NO_FLY);
        this.setQuackBehaviorType(QUACK_LOUD);
    }

    @Override
    public String display() {
        return "- Soy un Pato de Goma, mi nombre es " + this.getName() + " -";
    }
}
