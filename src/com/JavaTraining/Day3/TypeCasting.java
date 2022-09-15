package com.JavaTraining.Day3;

class Employee{
    void getPromotion(){
        System.out.println("got promotion");
    }
}

class Abhishek extends Employee{
    @Override
    void  getPromotion(){
        System.out.println("Abhishek has Got a Promotion");
    }
    void skilfulAtFrontEnd(){
        System.out.println("Abhishek is Skillfull at FrontEnd");
    }
}

class Ujwal extends Employee{
    @Override
    void  getPromotion(){
        System.out.println("Ujwal has Got a Promotion");
    }
    void skilfulAtBackEnd(){
        System.out.println("Ujwal is Skillfull at BackEnd");
    }
}


public class TypeCasting {
    public static void main(String[] args) {

        //byte -> short -> char -> int -> long -> float -> double
        // 1       2        2       4      8       4        8
        // Widening------------------------------------------>
        // <------------------------------------------Narrowing
        //=====================================================//
//        float x=4.5f;
//        double y=x;
//        System.out.println(y);
//        int a=97;
//        char ch=(char)a;
//        System.out.println(ch);
         Employee abhi= new Abhishek();
         Employee Ujwal= new Ujwal();

//         Abhishek ab= new Employee();
//         abhi.getPromotion();
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
