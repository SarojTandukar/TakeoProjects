package week4Day3;
/*Exercise 5: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
find the one that is missing from the array.
 For example, if the input is [3, 0, 1], the missing number is 2.*/
public class MissingNumber {
    public static void main(String[] args) {

        int [] arr = {3,0,1};

        int n= arr.length +1;
        int formula = (n * (n + 1))/2;

        for(int i =0 ; i<arr.length; i++){
            formula = formula-arr[i];

        }
        System.out.println(formula);
    }
}
