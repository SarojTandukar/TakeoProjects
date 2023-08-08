package week3Day1;

import java.util.Scanner;

/*Exercise 1 : create a simple program that takes a month number as input and prints the corresponding month name.If not found print invalid number.
        Ex : 1 -> January
        Hint : use switch case for comparison*/
public class Months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int month = scanner.nextInt();


        switch (month){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("Febraury");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            case 13 :
                System.out.println("Invalid");
                break;
        }


    }

}
