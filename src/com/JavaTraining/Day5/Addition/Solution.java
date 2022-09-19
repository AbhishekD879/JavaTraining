package com.JavaTraining.Day5.Addition;

public class Solution {
    public static void main(String[] args) {
       try {
           Adder myAdder = new Adder();
           myAdder.add(1,2);
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
}
