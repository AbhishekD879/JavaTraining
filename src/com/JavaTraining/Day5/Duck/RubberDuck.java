package com.JavaTraining.Day5.Duck;

public class RubberDuck implements Noise,Squeezable{
    @Override
    public void makeNoise() {
        System.out.println("making noise");
    }

    @Override
    public void squeez() {
        System.out.println("Can Squeez");
    }
}
