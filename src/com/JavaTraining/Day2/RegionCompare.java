package com.JavaTraining.Day2;

import java.util.Scanner;

public class RegionCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1=scanner.nextLine().toLowerCase();
        String str2=scanner.nextLine().toLowerCase();
        System.out.println("Enter the start range for string1");
        int s1=scanner.nextInt();
        System.out.println("Enter the End range for string1");
        int e1=scanner.nextInt();
        System.out.println("Enter the start range for string2");
        int s2=scanner.nextInt();
        System.out.println("Enter the End range for string2");
        int e2=scanner.nextInt();
       try {
           System.out.println(str1.substring(s1,e1).equals(str2.substring(s2,e2)));
       }catch (Exception e){
           System.out.println("Index out of bound");
       }
    }
}
