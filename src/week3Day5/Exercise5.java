package week3Day5;
/*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


        array123([1, 1, 2, 3, 1]) → true
        array123([1, 1, 2, 4, 1]) → false
        array123([1, 1, 2, 1, 2, 3]) → true*/
public class Exercise5 {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 1, 4, 3,};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                System.out.println(a[j]);
            }

        }

    }
}