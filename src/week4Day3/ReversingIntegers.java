package week4Day3;

import java.util.ArrayList;
import java.util.Arrays;

/*WAP to reverse list of integers.*/
public class ReversingIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for(int i =num.size()-1 ; i>=0 ; i--){
            System.out.println("Reversed array is : " + i);
        }




    }



}
