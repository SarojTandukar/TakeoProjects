package week4Day3;

import java.util.ArrayList;
import java.util.Arrays;

/*WAP to remove even numbers for a list of integers.*/
public class RemoveEvenNumbers {
    public static void main(String[] args) {

       // int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        ArrayList <Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        for( int n : num){
            if(n%2!=0){
                System.out.println(n);
            }
        }
    }
}
