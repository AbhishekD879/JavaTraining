package com.JavaTraining.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<Integer> myList= new ArrayList<>();
        myList.add(2);
//        myList=Collections.unmodifiableList(myList);
       try{
           myList.add(1);
       }catch (UnsupportedOperationException u){
           System.out.println("Cannot add to list");
       }
        System.out.println(Arrays.toString(myList.toArray()));
    }
}
