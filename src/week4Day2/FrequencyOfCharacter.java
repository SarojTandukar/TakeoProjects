package week4Day2;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

/*Exercise 5:Given a string, count the frequency of each character using a map.*/
public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "Colorado";
        str.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            System.out.println(ch);
            if(map.get(ch) == null){
               map.put(ch,1);}
            else{
                map.put (ch , map.get(ch) +1);
            }
        }
        map.forEach((key, value) ->{
            System.out.println(key +" occured " + value);
        });
        }
}

