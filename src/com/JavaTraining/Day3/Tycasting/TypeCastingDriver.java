package com.JavaTraining.Day3.Tycasting;


public class TypeCastingDriver {
    public static void main(String[] args) {

        //byte -> short -> char -> int -> long -> float -> double
        // 1       2        2       4      8       4        8
        // Widening------------------------------------------>
        // <------------------------------------------Narrowing
        //=====================================================//
        float x=4.5f;
        double y=x;
        System.out.println(y);
        int a=97;
        char ch=(char)a;
        System.out.println(ch);


        //======================UpCasting and DownCasting=======================

         Employee abhi= new Abhishek();//Upcasting
         Employee Ujwal= new Ujwal();//Upcasting

         abhi.getPromotion();
         doEmployeeStuff(Ujwal);
    }
    static void doEmployeeStuff(Employee emp){
        emp.getPromotion();
        if(emp instanceof Abhishek){
            Abhishek ab= (Abhishek)emp;//DownCasting
            ab.skilfulAtFrontEnd();
        }
        if (emp instanceof Ujwal){
            Ujwal uj= (Ujwal)emp;
            uj.skilfulAtBackEnd();
        }
    }
}
