package com.JavaTraining.Day1.SwitchCaseDemo;

import java.util.Scanner;

public class SwitchCase {
   static void function1(){
        System.out.println("function one called");
    }
   static void function5(){
        System.out.println("function five called");
    }
   static void function2(){
        System.out.println("function two called");
    }
   static void function3(){
        System.out.println("function three called");
    }
   static void function4(){
        System.out.println("function four called");
    }
   static void switchUse(int op) {

        switch (op){
            case 1:
                function1();
                break;
            case 2:
                function2();
                break;
            case 3:
                function3();
                break;
            case 4:
                function4();
                break;
            case 5:
                function5();
                break;
            default:
                System.out.println("invalid operation");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number in range [1-5]");
        switchUse(sc.nextInt());
    }
    boolean isMangoTree(int row, int column, int treeNumber){

        if(treeNumber<row){
            return true;
        }

        for(int i=1;i<=row;i++){
            if(i*row==treeNumber){
                return  true;
            }
            if((i+1*column)+1==treeNumber){
                return true;
            }
        }
        return false;
    }
}
