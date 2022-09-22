package com.JavaTraining.Day8.BirthdayCake;

import java.util.*;

public class BirthdayCandles {
    static int numberOfTallestCandles(Integer[] arr){
       int max= Collections.max(Arrays.asList(arr));
       int count=0;
       for (Integer i:arr){
           if(i==max){
               count+=1;
           }
       }
       return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Integer[] candles = new Integer[sc.nextInt()];
        for (int i=0; i<candles.length; i++){
            candles[i]=sc.nextInt();
        }

        System.out.println(numberOfTallestCandles(candles));
    }
}
