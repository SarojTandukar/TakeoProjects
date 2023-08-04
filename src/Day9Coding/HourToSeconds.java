package Day9Coding;
/*Exercise 1: Write a java program that takes an integer hours and converts it to seconds.

        Ex :
        convert(5) ➞ 18000*/

import java.util.Scanner;

public class HourToSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hour :");
        int hour = sc.nextInt();

        int seconds = 60;
        int minute = 60;
        int totalSeconds = hour* seconds * minute;

        System.out.println("Total seconds is " + totalSeconds);




    }
}
