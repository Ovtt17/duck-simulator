package com.example.ducksimulator;

import com.example.ducksimulator.model.*;
import com.example.ducksimulator.repository.DuckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DuckSimulatorApplication implements CommandLineRunner {

    private final DuckRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(DuckSimulatorApplication.class, args);
    }

    @Override
    public void run(String... args) {
        createAndShowWoodenDuck();
        createAndShowMergoDuck();
        createAndShowDiverDuck();
        createAndShowRubberDuck();
    }

    private void createAndShowDuck(Duck duck, String name) {
        System.out.println("--------------------------------------------------");
        duck.setName(name);
        var savedDuck = repository.save(duck);
        System.out.println(savedDuck.display());
        System.out.println(savedDuck.swim());
        System.out.println(savedDuck.performFly());
        System.out.println(savedDuck.performQuack());
    }

    private void createAndShowWoodenDuck() {
        createAndShowDuck(new WoodenDuck(), "Martin");
    }

    private void createAndShowMergoDuck() {
        createAndShowDuck(new MergoDuck(), "Pedro");
    }

    private void createAndShowDiverDuck() {
        createAndShowDuck(new DiverDuck(), "Juan");
    }

    private void createAndShowRubberDuck() {
        createAndShowDuck(new RubberDuck(), "Lucas");
    }
}
