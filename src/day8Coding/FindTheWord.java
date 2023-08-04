package day8Coding;

import java.util.Scanner;

public class FindTheWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str = scanner.nextLine();
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        String word = findWords(str, number);
        System.out.println(word);
    }

    private static String findWords(String str, int number) {
        String[] newArray = str.split(" ");
        return newArray[number-1];
    }
}