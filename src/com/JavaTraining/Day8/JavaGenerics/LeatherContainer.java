package com.JavaTraining.Day8.JavaGenerics;

public class LeatherContainer<T extends Leather> {
    private T leatherItem;
    LeatherContainer(T leatherItem){
        this.leatherItem=leatherItem;
    }
    void printType(){
        System.out.println(this.leatherItem.getClass());
    }
    void printParentClass(){
        leatherItem.leatherClassMethod();
    }

}