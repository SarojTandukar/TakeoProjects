package week3Day2;

import java.util.Scanner;

/*Exercise 2: For any input, if the value entered is other than 1 or 2, keep looping until the user enters a correct value.
Ex : entered value 10  -> output ,please enter correct value continue,
Hint : use appropriate loop*/
public class FindCorrectValue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Pick the number :");
        int number = sc.nextInt();

        int i = 0;
        while (i<=15){
            if( number!=1 && number!=2){
                System.out.println("Please enter correct number :");
                break;
            }
            else{
                System.out.println("you picked correct number");
                i++;
                break;

            }

        }
    }
}
