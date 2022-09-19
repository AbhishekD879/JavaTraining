package com.JavaTraining.Day5;

public class StudentDriverCode {


    public static void main(String[] args) {
        Student abhi= new Student();
        abhi.setAge(6);
        abhi.setName("Abhi");
        abhi.setRollNumber(3);
        abhi.setStandard(1);
        System.out.println(abhi.getName()+" "+abhi.getAge()+" "+abhi.getStandard()+" "+abhi.getRollNumber());
    }
}
