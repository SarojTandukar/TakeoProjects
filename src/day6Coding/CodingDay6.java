package day6Coding;

import java.util.Scanner;

public class CodingDay6 {

    public static void main(String[] args) {
        String [] array = {"ABC","XYZ","LION"}; //declaring the string array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name = scanner.nextLine();

        //String name = "XYZ"; //name to search
       // boolean found = true; (can use boolean too)
         for(int i = 0; i<array.length;i++){
             System.out.println(array[1]);

             break;
         }
         if(array[1].equals("XYZ")){
             System.out.println("XYZ exist");
         }
         else{
             System.out.println("XYZ doesn't exist");
        }
      }
    }

