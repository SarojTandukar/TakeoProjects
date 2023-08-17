package week4Day2;
/*Exercise 4:Given a list of integers and a target sum, find two numbers in the list that add up to the target sum.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TargetingSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(1,5,4,5,2)) ;


        for(int i : numbers){            //i=1,5,4,5,2
            int targetedSum = 10-i;
            if(i==targetedSum){
            System.out.println(i);
        }

    }
}
}
