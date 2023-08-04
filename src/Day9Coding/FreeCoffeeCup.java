package Day9Coding;

import java.util.Scanner;

/*Exercise 3: For each of the 6 coffee cups I buy, I get a 7th cup free. In total, I get 7 cups. Create a java program that takes n cups bought and return as an integer the total number of cups I would get.

        Examples
        totalCups(6) ➞ 7

        totalCups(12) ➞ 14

        totalCups(213) ➞ 248*/
public class FreeCoffeeCup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cups of coffee did you buy?");
        int noOfCups = sc.nextInt();
        int minCups = 6;

        if(noOfCups<minCups){
            System.out.println("You must buy more than 6 cups of coffee to get 1 free");
        }
        else if(noOfCups>=6){
            System.out.println("You get " + (noOfCups+noOfCups/minCups) + " cups of coffee");
        }
    }
}
