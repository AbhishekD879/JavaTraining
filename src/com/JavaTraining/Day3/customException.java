package com.JavaTraining.Day3;
//Amusement park ticket vending machine
//        Eg: Show with kids < 120 cm Not eligible for roller-coaster ride
import java.util.Scanner;
class InvalidHeightsException extends Exception {
    InvalidHeightsException(String msg) {
        super(msg);
    }
}
public class customException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the kids Height in Cm");
        int height = scanner.nextInt();
        try {
            if (height < 120) {
                throw new InvalidHeightsException("Height is less than 120 ");
            } else {
                System.out.println("The Kid Can Ride Roller coaster");
            }
        } catch (InvalidHeightsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
