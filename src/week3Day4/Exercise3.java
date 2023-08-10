package week3Day4;

/*Exercise 3: Write a program in java to find maximum of numbers that will be inputed by user.
Ex: 3,5,6  : output will be 6
Hint : just use set of comparisons between numbers.*/
public class Exercise3 {
    public static void main(String[] args) {
     //   Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the number :");
       // int number = sc.nextInt();
       int arr [] = {3,5,6};
        int max = arr[1];

        for(int i =0; i < arr.length; i++){
            if(arr[i]>max){  //3>3 f 5>3 t 6>5 t
                max=arr[i];   //max =5 max=6
                System.out.println(max);
            }

        }
    }
}
