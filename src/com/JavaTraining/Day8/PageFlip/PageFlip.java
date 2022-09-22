package com.JavaTraining.Day8.PageFlip;



import java.util.Scanner;

public class PageFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of pages");
        int n=scanner.nextInt();
        System.out.println("Enter Page to reach");
        int p= scanner.nextInt();
        // 1,2  3,4  5,6

        if(n-p>=p){
            System.out.println(p/2);
        }else{
            if(n%2==0){
                System.out.println((n-p+1)/2);
            }else{
                System.out.println((n-p)/2);
            }
        }
    }
}
