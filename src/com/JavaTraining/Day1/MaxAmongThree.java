package com.JavaTraining.Day1;

import java.util.Scanner;

public class MaxAmongThree {
    static void maxAmongThree(int n1,int n2,int n3){
        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three Numbers");
        maxAmongThree(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
    }
}
