package com.example.ducksimulator.model;

import com.example.ducksimulator.behavior.interfaces.IFly;
import com.example.ducksimulator.behavior.interfaces.IQuack;
import com.example.ducksimulator.behavior.enums.FlyBehavior;
import com.example.ducksimulator.behavior.enums.QuackBehavior;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "duck_type")
public abstract class Duck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private FlyBehavior flyBehaviorType;

    @Enumerated(EnumType.STRING)
    private QuackBehavior quackBehaviorType;

    @Transient
    protected IFly flyBehavior;

    @Transient
    protected IQuack quackBehavior;

    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    public String swim() {
        return "* Nado *";
    }

    public abstract String display();
}