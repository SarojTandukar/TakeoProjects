package week4Day2;
/*Exercise 1: Write a Java program that takes a sentence as input and prints the
frequency of each word using a map.*/

import com.sun.jdi.Value;

import java.util.*;

public class FrequencyOfWords {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the sentence.");
        String str =scan.nextLine();
        scan.close();
       // String str = "who is ram and who is shyam";

        String [] st = str.split(" ");

        Map<String, Integer> hm = new HashMap<>();{

            for(int i = 0 ; i<st.length-1; i++){
                if(hm.containsKey(st[i])){
                hm.put(st[i], hm.get(st[i])+1);
            }
            else {
                hm.put(st[i],1);
            }

    }System.out.println(hm);
}
    }
}
