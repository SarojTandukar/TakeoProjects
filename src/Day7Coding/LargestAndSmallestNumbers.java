package Day7Coding;

import java.util.Scanner;

public class LargestAndSmallestNumbers {
    public static void main(String[] args) {
        int [] newArray = {1,9,5,7,8};

        int largest = newArray[0]; //1
        int smallest = newArray[0]; //1

        for (int i=0; i<newArray.length; i++) {
            if(newArray[i] > largest) {
                largest = newArray[i];
            }
            else if(newArray[i] < smallest) {
                smallest = newArray[i];
            }
        }


        System.out.println("Largest: " + largest + " Smallest: " + smallest);
    }



    }

