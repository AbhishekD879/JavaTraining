package com.JavaTraining.Day7.FunctionalInterface;

public class Diver {
    public static void main(String[] args) {
        Printable pr=s-> System.out.println(s);
        pr.print("hi");
    }
}
