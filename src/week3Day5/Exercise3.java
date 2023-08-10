package week3Day5;
/*Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

        sameFirstLast([1, 2, 3]) → false
        sameFirstLast([1, 2, 3, 1]) → true
        sameFirstLast([1, 2, 1]) → true*/

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
     /*  Scanner sc = new Scanner(System.in);
       System.out.println("How many numbers to enter");
       int numbers = sc.nextInt();
        System.out.println("Enter the numbers");
        int [] a = new int[numbers];*/

        int [] a = {1,3,2,1};

        for(int i = 0;i<a.length ; i++){
              //  a[i] = sc.nextInt();

            if(a[0] == a[a.length-1]){
                System.out.println("True");
            }

           else{
                System.out.println("False");
            }

        }

    }
}
