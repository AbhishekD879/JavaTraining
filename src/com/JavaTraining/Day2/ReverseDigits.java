package com.JavaTraining.Day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Digit");
        int dig= scanner.nextInt();
        int reverse=0;
        while(dig != 0)
        {
            int remainder = dig % 10;
            reverse = reverse * 10 + remainder;
            dig = dig/10;
        }
        System.out.println(reverse);
    }
}
