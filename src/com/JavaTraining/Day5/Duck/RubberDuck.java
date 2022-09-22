package com.JavaTraining.Day5.Duck;

public class RubberDuck extends Duck implements Noise,Squeezable{
    @Override
    public void makeNoise() {
        System.out.println("making noise");
    }

    @Override
    public void squeez() {
        System.out.println("Can Squeeze");
    }
}
