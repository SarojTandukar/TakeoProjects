package day8Coding;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        String reversed =  reverseString(originalString);
        System.out.println(reversed.equals(originalString) ? true : false);
    }

    private static String reverseString(String originalString) {
        String reversed = "";
        for ( int i = originalString.length() ; i > 0 ; i--){
            reversed = reversed + originalString.charAt(i-1);
        }
        return reversed;
    }
}
