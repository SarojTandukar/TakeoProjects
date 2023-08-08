package week3Day1;

import java.util.Scanner;

/*Exercise 6 : Write a program to check print array in reverse order.

Ex : {5,6,7,8} -> {8,7,6,5}

hint : use for loop with decrement operator*/
public class ReversedArray {
    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers :");
        int numbers = sc.nextInt();
        int [] array = new int[numbers];

        for(int i = 0; i< array.length;i++){
            System.out.print(array[i]);
        }

       for(int i = array.length-1; i >= 0 ;i-- ){
           System.out.print(array[i]);

        }*/

            int [] array ={5,6,7,8};

            for (int i = array.length - 1; i>=0 ; i--){
                System.out.println(array[i]);
            }
        }

    }

