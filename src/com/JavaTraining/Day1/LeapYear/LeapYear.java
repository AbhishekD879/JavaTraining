package com.JavaTraining.Day1.LeapYear;

import java.util.Scanner;

public class LeapYear {
   static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        System.out.println(isLeapYear(sc.nextInt())?"It is Leap Year":"Its not Leap Year");

    }
}
