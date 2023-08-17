package week4Day1;
/*Exercise 2: Write a Java program that merges two ArrayLists of integers and prints the resulting merged ArrayList.
 */
import java.util.ArrayList;

public class MergingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arl = new ArrayList<Integer>();
        arl.add(0);
        arl.add(1);
        arl.add(2);
        ArrayList<Integer> arlist = new ArrayList<Integer>();
        arlist.add(20);
        arlist.add(10);
        arlist.add(15);

        arl.addAll(arlist);
        System.out.println("Merged Elements :" + arl);

        }
    }

