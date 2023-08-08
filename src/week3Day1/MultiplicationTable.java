package week3Day1;

import java.util.Scanner;

/*Exercise 3 : Write a program that prints the multiplication table of a given number.

        Ex : 2*1 = 2
        2*2 = 4 and so on.

        hint : use for loop*/
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the multiplication of - ");
        int multiplication = sc .nextInt();

         int[]array= new int[10];
         for(int i =1 ; i <=array.length ; i++){
            int mul = multiplication * i;
             System.out.println(mul);

         }
    }
}
