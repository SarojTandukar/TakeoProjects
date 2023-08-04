package Day5CodingExercise;

import java.util.Scanner;

public class BmiCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Height");
        double h = sc.nextDouble();
        System.out.println("Enter your Weight");
        int w = sc.nextInt();
        sc.radix();
    }
           public void add(int w, double h){
        int a = w;
        double  b = h;
        int sum  = (int)(a/b*b);
            System.out.println("Your BMI"+" = "+  sum);
        }
    }

