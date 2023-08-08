package week3Day1;

import java.util.Scanner;

/*Exercise 4 : Write a program that takes a string and a character as input and counts and prints the number of occurrences of that character in the string.
Ex : Deepak and e  -> output 2
hint : use loops*/
public class Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the words :");
        String words = sc.nextLine();
        char ch[] = words.toCharArray();
        //System.out.println(ch);
        System.out.println("Select the number for char");
        char number = sc.next().charAt(0);

         int n = 0;
        for (int i = 0; i <= ch.length ; i++) {

         if(ch [i] == number){

              n++;
         }
        }
        System.out.println(n);
    }
}