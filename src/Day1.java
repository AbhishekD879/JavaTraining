public class Day1 {
    boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
    void function1(){
        System.out.println("function one called");
    }
    void function5(){
        System.out.println("function five called");
    }
    void function2(){
        System.out.println("function two called");
    }
    void function3(){
        System.out.println("function three called");
    }
    void function4(){
        System.out.println("function four called");
    }
    void switchUse(int op) {

        switch (op){
            case 1:
                function1();
                break;
            case 2:
                function2();
                break;
            case 3:
                function3();
                break;
            case 4:
                function4();
                break;
            case 5:
                function5();
                break;
            default:
                System.out.println("invalid operation");
        }
    }
}
