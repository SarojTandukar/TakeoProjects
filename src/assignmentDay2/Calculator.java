package assignmentDay2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        String number = scan.nextLine();

        System.out.println("operator");
        String operator = scan.nextLine();

        System.out.println("Enter second number");
        String secondNumber = scan.nextLine();


        if (operator.equals("+")){
           System.out.println(number + secondNumber);
        }
        /*else if (scan.equals("-")){
            System.out.println(number - secondNumber);
        }
        else if (scan.equals("*")){
            System.out.println(number * secondNumber);
        }*/




    }
}
