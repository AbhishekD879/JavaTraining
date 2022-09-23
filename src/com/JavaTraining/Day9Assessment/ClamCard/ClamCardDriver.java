package com.JavaTraining.Day9Assessment.ClamCard;

public class ClamCardDriver {
    public static void main(String[] args) {
        ClamCard michael = new ClamCard();
        //test 1
//        michael.travel("A","A");
//        System.out.println("The total Cost is: "+michael.getTotalCost());

        //test 2
//        michael.travel("A","B");
//        System.out.println("The total Cost is: "+michael.getTotalCost());

        //test 3
//          michael.travel("A","A");
//          michael.travel("A","B");
//          System.out.println("The total Cost is: "+michael.getTotalCost());

        //test 4
//        michael.travel("A","A");
//        michael.travel("A","A");
//        System.out.println("The total Cost is: "+michael.getTotalCost());
//        michael.travel("A","A");
//        michael.travel("A","A");
//        System.out.println("The total Cost is: "+michael.getTotalCost());

        //test 5
        michael.travel("A", "B");
        michael.travel("B", "B");
        michael.travel("B", "B");
        michael.travel("B", "A");
        System.out.println("The total Cost is: " + michael.getTotalCost());
    }
}
