package com.JavaTraining.Day3.ExceptionCalculator;

public class UncheckedExceptionCalculatorDriver {

    public static void main(String[] args) {
        Calculator cal = new Calculator(5);
        try {
            cal.add(5).add(5).multiply(2).divide(1).subtract(1).finalValue();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (NullPointerException e) {
            System.out.println("Invalid integer Supplied");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Argument Supplied");
        } finally {
            System.out.println("Final value After Operation " + cal.finalValue());
        }
    }
}
