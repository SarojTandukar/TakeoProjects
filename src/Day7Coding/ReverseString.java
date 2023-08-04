package Day7Coding;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
       // char[] a ={'s','a','r','o','z'};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        char[] username = name.toCharArray();

        String a = "";


       for(int i = name.length()-1; i>=0 ; i--){
           a = a+username[i];
        }
              System.out.println("Reverse of "+ name + "is "+ a);
    }
}
