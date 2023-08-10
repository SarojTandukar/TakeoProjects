package week3Day4;
/*Exercise 2: Write a program in java to find SmallestPositiveInt in an array.
Ex: {-2,0,3,4,1,9}  -> output will be 1

hint : The variable smallestPositiveInt is initialized to 1 because the smallest positive integer in an array must be greater than or equal to 1.
The loop in the program iterates through the array from 0 to array.length - 1. This is because the smallest positive integer in an array must be one of the elements in the array.
The condition  checks if the element at index i is greater than 0 and less than or equal to smallestPositiveInt. If the condition is true, then the element at index i is the smallest positive integer in the array.
The variable smallestPositiveInt is updated to the value of the element at index i if the condition array[i] > 0 && array[i] <= smallestPositiveInt is true.
The program returns the value of smallestPositiveInt.*/
public class Exercise2 {
    public static void main(String[] args) {
        int [] array = {-2,0,3,4,1,9};
        int smallestPositiveInt =1;
        for(int i = 1 ; i< array.length -1; i++){
            if(array[i] > 0 && array[i] <= smallestPositiveInt){

                System.out.println("smallestPositiveInt is : "+ smallestPositiveInt);
            }
        }
    }
}
