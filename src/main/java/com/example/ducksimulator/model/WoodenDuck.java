package com.example.ducksimulator.model;

import com.example.ducksimulator.behavior.impl.NoFly;
import com.example.ducksimulator.behavior.impl.NoQuack;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import static com.example.ducksimulator.behavior.enums.FlyBehavior.NO_FLY;
import static com.example.ducksimulator.behavior.enums.QuackBehavior.NO_QUACK;

@Entity
@DiscriminatorValue("WOODEN")
public class WoodenDuck extends Duck {

    public WoodenDuck() {
        // Wooden ducks neither fly nor quack
        this.flyBehavior = new NoFly();
        this.quackBehavior = new NoQuack();
        this.setFlyBehaviorType(NO_FLY);
        this.setQuackBehaviorType(NO_QUACK);
    }

    @Override
    public String display() {
        return "- Soy un Pato de Madera, mi nombre es " + this.getName() + ". Solamente puedo flotar. -";
    }
}
