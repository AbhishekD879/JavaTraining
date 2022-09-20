package com.JavaTraining.Day3.WrapperClassesTask;

//Convert Primitive Type to Wrapper Objects (boxing/autoboxing)
//For the following:
//int a = 9;
//double d = 6.78;
//and check if they are converted to wrapper classes
//Sample output:
//An object of Integer is created.
//An object of Double is created.
public class WrapperClasses {
    public static void main(String[] args) {
        int a = 9;
        double d = 6.78;

        //boxing
        Integer a1 = new Integer(a);//Deprecated
        Double d1 = new Double(d);//Deprecated
        //autoBoxing
        Integer a2 = a;
        Double d2 = d;
        //unBoxing
        int x = a1;
        double y = d2;

        if (d2 instanceof Double)
            System.out.println("An object of Double is created.");

        if (a1 instanceof Integer)
            System.out.println("An object of Integer is created.");


    }
}
