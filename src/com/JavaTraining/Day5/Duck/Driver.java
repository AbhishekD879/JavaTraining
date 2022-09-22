package com.JavaTraining.Day5.Duck;

public class Driver {
    public static void main(String[] args) {
        MallardDuck mallardDuck= new MallardDuck();
        WoodenDuck woodenDuck= new WoodenDuck();
        RubberDuck rubberDuck=new RubberDuck();
        mallardDuck.fly();
        mallardDuck.sell();
        mallardDuck.swim();
        mallardDuck.makeNoise();
        mallardDuck.walk();

        //
        woodenDuck.decorate();
        //
        rubberDuck.makeNoise();
        rubberDuck.squeez();
    }
}
