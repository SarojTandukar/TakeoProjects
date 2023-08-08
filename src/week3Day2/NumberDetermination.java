package week3Day2;
/*Exercise 1 : Write a program that inputs five numbers and determines and prints the number of negative numbers input, the number of positive numbers & input and the number of zeros input.
Ex: 3,6,0,6,3,-4,-2 : negative number : 2 ,positive number : 4 ,zero : 1
Hint can use array to store elements and loop to check accordingly*/
public class NumberDetermination {
    public static void main(String[] args) {
      int [] array = {3,6,0,6,3,-4,-2};


      for (int i = 0 ; i<=array.length ; i++){
          if(array[i]>0){
              System.out.println("Positive number " + array[i]);
          }
          else if (array[i] < 0 ){
              System.out.println("Negative number " + array[i]);
          }
          else{
              System.out.println("Zero " + array[i]);
          }

      }
    }
}
