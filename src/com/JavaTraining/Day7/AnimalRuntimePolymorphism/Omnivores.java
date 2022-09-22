package com.JavaTraining.Day7.AnimalRuntimePolymorphism;

public class Omnivores extends Animal {
    @Override
    void eats() {
        System.out.println("Omnivores eats Meat as well as Plants");
    }
}
