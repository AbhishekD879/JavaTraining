package com.JavaTraining.Day7.EuroProblem;

public class EuroDriver {
    public static void main(String[] args) {
        Euro euro = new Euro(10);
        System.out.println(euro.addEuro(new Euro(10)).getValue());
    }
}
