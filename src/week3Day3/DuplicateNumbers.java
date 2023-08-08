package week3Day3;
/*Exercise 2: You are given an array of integers. Write a Java program to find and print the elements that appear more than once in the array.
Ex : {1,8,5,8,4,3,4} : Duplicate -> 8,4*/
public class DuplicateNumbers {
    public static void main(String[] args) {
        int [] array = {1,8,5,8,4,3,4};

        for (int i = 0 ; i<array.length; i++) {
            for (int j = i+1; j < array.length; j++)
                if (array[i] == array[j]) {
                    System.out.println("Duplicate number is : " + array[i]);
                }

        }
    }
}
