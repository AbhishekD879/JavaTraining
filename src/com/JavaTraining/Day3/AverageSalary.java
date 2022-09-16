package com.JavaTraining.Day3;

import java.util.Arrays;
import java.util.Collections;





public class AverageSalary {
    static int avgExcludeMinMax(Integer[] salries) throws ArithmeticException {
        int min = Collections.min(Arrays.asList(salries));
        int max = Collections.max(Arrays.asList(salries));
        int count=0;
        int sum=0;
        for(int salary:salries) {
            if(salary!=min && salary!=max){
                sum+=salary;
                count+=1;
            }
        }
       return sum/count;
    }

    public static void main(String[] args) {
        Integer[] salries ={
                4000,3000,1000,2000
        };
        try {
            System.out.println((double) avgExcludeMinMax(salries));
        }catch (ArithmeticException arithmeticException){
            System.out.println("Requires more than one number");
        }
    }
}
