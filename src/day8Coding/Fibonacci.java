package day8Coding;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n = sc.nextInt();   //int n = ...;

        int first = 0;
        int second = 1;


        for (int i = 0 ; i<n ; i++){
         int third = first + second;
            System.out.println(first);
            first =second;
            second =third;

        }
    }



    }

