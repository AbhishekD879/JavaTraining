package com.JavaTraining.Day4.GenericPractice;


public class GenericExampleDriver {
    public static void main(String[] args) {
        CustomStack<Integer> c= new CustomStack<>();
       c.push(1);
       c.push(2);
       c.push(4);
        System.out.println(c.pop());
        System.out.println(c.peek());
    }
}
