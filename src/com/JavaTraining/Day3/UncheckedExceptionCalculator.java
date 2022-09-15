package com.JavaTraining.Day3;

class Calculator {
    private int num;

    public Calculator(int num) throws NullPointerException, IllegalArgumentException {
        this.num = num;
    }

    Calculator add(int number) throws NullPointerException, IllegalArgumentException {
        this.num += number;
        return this;
    }

    Calculator subtract(int number) throws NullPointerException, IllegalArgumentException {
        this.num -= number;
        return this;
    }

    Calculator multiply(int number) throws NullPointerException, IllegalArgumentException {
        this.num *= number;
        return this;
    }

    Calculator divide(int number) throws NullPointerException, IllegalArgumentException {
        this.num /= number;
        return this;
    }

    int finalValue() {
        return this.num;
    }
}

public class UncheckedExceptionCalculator {

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
