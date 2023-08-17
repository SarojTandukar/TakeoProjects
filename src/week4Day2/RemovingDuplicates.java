package week4Day2;
/*Exercise 2: Write a Java program that takes a list of integers, removes duplicate values, and prints the result using a set.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RemovingDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,3,4,4));

        HashSet<Integer> set = new HashSet<Integer>(numbers);
        System.out.println(set);
    }
}
