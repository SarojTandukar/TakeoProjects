package week3Day4;

import java.util.Scanner;

/*If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, . fine = 15$ per day after return date
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the . fine = 500$ per month after return month
If the book is returned after the calendar year in which it was expected, there is a fixed fine  = 1000$

Ex : d1,m1,y1 = 12 02 2014  -- returned date
     d2,m2,y2 = 12 02 2014  -- due date
     output -- fine = 0

     d1,m1,y1 = 12 02 2014  -- returned date
     d2,m2,y2 = 12 02 2015  -- due date
     output -- fine = 1000$

Input Format

The first line contains 3 space-separated integers denoting the respective dd, mm, and yyyy  on which the book was actually returned.
The second line contains 3 space-separated integers denoting the respective dd, mm , and yyyy on which the book was expected to be returned (due date).

STDIN       Function
-----       --------
9 6 2015    day = 9, month = 6, year = 2015 (date returned)
6 6 2015    day = 6, month = 6, year = 2015 (date due)*/
public class Exercise1 {
    public static void main(String[] args) {

        int [] dueArray = {12,02,2014};
        Scanner sc = new Scanner(System.in);
        //System.out.println("Due date :");
        //int dueDate =sc.nextInt();

        System.out.println("Returned date :"); // in space
        int returnDate = sc .nextInt();
        int [] returned = new int[returnDate];


         for(int i =0 ; i<=dueArray.length ; i++){
        if(returnDate<i ){
            System.out.println("Fine = $0");
        }
        else {
            System.out.println("Fine = $1000");
        }
         }
    }
}
