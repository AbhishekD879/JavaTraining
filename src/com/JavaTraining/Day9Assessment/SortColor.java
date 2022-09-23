package com.JavaTraining.Day9Assessment;

import java.util.Arrays;
import java.util.Scanner;

public class SortColor {

    static int colorSpreader(int[] colors,int currentPointer,int color,int colorCode){
        while(color>0){
            colors[currentPointer]=colorCode;
            currentPointer++;
            color--;
        }
        return currentPointer;
    }
    static void sortColor(int[] colors) {
        int red=0;
        int white=0;
        int blue=0;
        for (int color : colors) {
            if (color == 0) {
                red += 1;
            }
            if (color == 1) {
                white += 1;
            }
            if (color == 2) {
                blue += 1;
            }
        }
        int redCurrent=colorSpreader(colors,0,red,0);
        int whiteCurrent=colorSpreader(colors,redCurrent,white,1);
        colorSpreader(colors,whiteCurrent,blue,2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int[] colors = new int[scanner.nextInt()];
        System.out.println("Enter colors");
        for (int i = 0; i < colors.length; i++) {
            colors[i]=scanner.nextInt();
        }
        sortColor(colors);
        System.out.println(Arrays.toString(colors));
    }
}
