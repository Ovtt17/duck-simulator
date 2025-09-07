package com.example.ducksimulator.model;

import com.example.ducksimulator.behavior.impl.NoFly;
import com.example.ducksimulator.behavior.impl.QuackSoft;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import static com.example.ducksimulator.behavior.enums.FlyBehavior.NO_FLY;
import static com.example.ducksimulator.behavior.enums.QuackBehavior.QUACK_SOFT;

@Entity
@DiscriminatorValue("DIVER")
public class DiverDuck extends Duck {

    public DiverDuck() {
        this.flyBehavior = new NoFly();
        this.quackBehavior = new QuackSoft();
        this.setFlyBehaviorType(NO_FLY);
        this.setQuackBehaviorType(QUACK_SOFT);
    }

    @Override
    public String display() {
        return "- Soy un Pato Buceador, mi nombre es " + this.getName() + " -";
    }
}
