package com.JavaTraining.Day7.MagicSquare;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        int rightSum=0;
        int leftSum=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==j){
                    rightSum+=matrix[i][j];
                }
                if ((i + j) == (n - 1))
                    leftSum += matrix[i][j];
            }
        }
        System.out.println(rightSum==leftSum?"yes":"no");
    }

}
