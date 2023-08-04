package Day5CodingExercise;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks of the student");
        int marks = sc.nextInt();
      if(marks<=100 && marks>=90){
            System.out.println("Grade A");
      }
            else if (marks<=89 && marks>=80){
              System.out.println("Grade B");
            }
            else if (marks<=79 && marks>=70){
          System.out.println("Grade C");
            }
            else{
            System.out.println("Fail");
          }
      }
          }






