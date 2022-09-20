package com.JavaTraining.Day3.ExceptionCalculator;

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
