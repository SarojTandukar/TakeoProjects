package week3Day1;

import java.util.Arrays;

/*Exercise 5 : Write a program to check if an array is sorted in ascending order.

Ex : {1,2,3,4,8,9} : sorted

Hint : use loops
*/
public class SortedArray {
    public static void main(String[] args) {

        int []array = {2,3,4,1,8,9};

        Arrays.sort(array);
        for(int i = 0 ; i <=array.length; i++){
            System.out.println(array[i]);
        }
    }
}
