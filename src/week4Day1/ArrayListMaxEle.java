package week4Day1;
/*Exercise 1: Write a Java program that finds the maximum element in an ArrayList of integers.*/
import java.util.ArrayList;

public class ArrayListMaxEle {
    public static void main(String[] args) {

        ArrayList<Integer> arl = new ArrayList<Integer>();
        arl.add(10);
        arl.add(20);
        arl.add(2);
        arl.add(1);
        arl.add(102);
        arl.add(210);

        System.out.println("Maximun element : "+ arl.size());
        System.out.println("Highest index is : "+ (arl.size()-1));


    }
}
