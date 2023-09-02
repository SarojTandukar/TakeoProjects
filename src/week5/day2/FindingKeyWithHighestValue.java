package week5.day2;

import java.util.HashMap;
import java.util.Map;

/*Exercise 2: Write a program in java that finds the key with the highest value in a given map.
// Map<String,Integer> map ;
// map.put("A",10)
// map.put("B",20)
// output will be B  */
public class FindingKeyWithHighestValue {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",60);
        map.put("C",70);
        map.put("D",40);

        String key= null;
        int value= 0;

        for(  Map.Entry<String,Integer> ent :map.entrySet()){
            if(ent.getValue() >  value){

                    value = ent.getValue();
                    key = ent.getKey();

                }
            }
            System.out.println("Max Value key is :" + key);
        }

    }

