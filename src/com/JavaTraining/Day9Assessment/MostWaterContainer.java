package com.JavaTraining.Day9Assessment;

import java.util.Scanner;

public class MostWaterContainer {

    static int mostWaterContainerFinder(int[] container) {

        int left = 0;
        int right = container.length - 1;
        double max = Double.MIN_VALUE;

        while (left < right) {

            double currentVolume = ((right - left) * Math.min(container[left], container[right]));
            max = Math.max(max, currentVolume);

            if (container[left] < container[right]) {
                left++;
            } else {
                right--;
            }
        }
        double finalMax = max;
        return (int) finalMax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(mostWaterContainerFinder(arr));
    }

}
