package Day7Coding;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int factorial = 1;

        for(int i = 1; i<=number; i++){

           factorial = i * factorial; //*=
        }
        System.out.println("Factorial of 5 is :" + factorial);

    }
}
