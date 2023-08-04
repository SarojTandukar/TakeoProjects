package Day5CodingExercise;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Principle");
        int p = sc.nextInt();
        System.out.println("Rate of Interest");
        double r = sc.nextDouble();
        System.out.println("Time period");
        int t = sc.nextInt();
        System.out.println("Total payment" + " = " + p*r*t/100);

    }
}
