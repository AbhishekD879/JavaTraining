package com.JavaTraining.Day5.Duck;

public class MallardDuck extends Duck implements Flyable,Swimable,Noise,Walkable{
    @Override
    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("making noise");
    }

    @Override
    public void swim() {
        System.out.println("swimming...");
    }

    @Override
    public void walk() {
        System.out.println("Walking....");
    }
}
