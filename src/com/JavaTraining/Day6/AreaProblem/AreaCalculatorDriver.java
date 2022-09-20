package com.JavaTraining.Day6.AreaProblem;

public class AreaCalculatorDriver {
    public static void main(String[] args) {
         double circleArea = new Area().findArea((Integer)5);
         int squareArea = new Area().findArea(5);
         int RectangleArea= new Area().findArea(2,2);
        System.out.println("Square's Area= "+squareArea);
        System.out.println("Circle's Area= "+circleArea);
        System.out.println("Rectangle's Area= "+RectangleArea);
    }
}
