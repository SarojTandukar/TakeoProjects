package week4Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*Exercise 3: You are given a list of integers where all numbers appear twice
 except for one. Your task is to find and return the integer that appears only once.
 */
public class FindInteger {

    public static  int singleNumber(int [] nums){
        int result=0;
        for (int num : nums){
            result = result^ num;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {2,3,6,3,2};
        int single = singleNumber(nums);
        System.out.println(single);
    }
}
