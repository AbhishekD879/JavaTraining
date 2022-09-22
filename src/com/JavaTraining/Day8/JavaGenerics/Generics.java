package com.JavaTraining.Day8.JavaGenerics;
/*
     -----------
    |           |
    |  Generic  |
    |  Leather  |
    |    Box    |
    |           |
     -----------
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<Integer>();
//        List<String> strings= new ArrayList<String>();
//        for(int i = 0; i < 10; i++) {
//            numbers.add(i);
//            strings.add(i+" Str");
//        }
//        printList(numbers);
//        printList(strings);
        List<? extends Number> list1= new ArrayList<>();
        List<Integer> stringList=new ArrayList<Integer>();
        list1=stringList;
//        List<Number> anyNumber= new ArrayList<>();
//        List<Integer> integer= new ArrayList<>();
//        anyNumber=integer;
//        List<? super Integer> l1= new ArrayList<>();
//
//       LeatherContainer<Shoe> shoe= new LeatherContainer<>(new Shoe());
////       shoe.printType();
//            shoe.printParentClass();
    }

    static <T extends Integer> T add(T a,T b){
        return a;
    }

    static void printList(List<?> myList){
       Iterator itr= myList.iterator();
       while (itr.hasNext()){
           System.out.println(itr.next());
       }
    }
}
