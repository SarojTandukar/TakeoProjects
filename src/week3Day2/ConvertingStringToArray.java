package week3Day2;

import java.util.Scanner;

/*Exercise 3: Write java program to convert a string to an array.
Ex : "how are you" -> {"how","are","you"}
hint : use split .*/
public class ConvertingStringToArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Strings :");
        String input = sc.nextLine();

       // String input = "Hello my name is Saroj";
        String [] stringarray = input.split(" ");


        for (int i = 0 ; i <= stringarray.length; i++){

            System.out.println(stringarray[i]);
        }

    }
}
