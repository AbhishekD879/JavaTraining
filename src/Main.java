import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Year:");
//        int year = sc.nextInt();
//        System.out.println(new Day1().isLeapYear(year)?"it is leap Year":"It's not leap year");

        System.out.println("Enter the Operation [1-5]:");
        new Day1().switchUse(sc.nextInt());
    }
}