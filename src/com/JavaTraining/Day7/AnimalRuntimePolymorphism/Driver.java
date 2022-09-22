package com.JavaTraining.Day7.AnimalRuntimePolymorphism;

public class Driver {
    public static void main(String[] args) {
        Animal loin= new Carnivores();
        Animal deer= new Herbivores();
        Animal Bear = new Omnivores();
        loin.eats();
        deer.eats();
        Bear.eats();
    }
}
