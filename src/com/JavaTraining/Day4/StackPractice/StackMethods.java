package com.JavaTraining.Day4.StackPractice;

import java.util.List;
import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack<Integer> li= new Stack<>();
        for (int i=0; i<5; i++)li.push(i);

        System.out.println(li);
        li.pop();
        System.out.println(li);
        System.out.println(li.search(2));
        System.out.println(li.size());
        System.out.println(li.peek());
    }
}
