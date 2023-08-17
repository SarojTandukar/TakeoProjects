package week4Day2;
/*Exercise 3:Create a simple phonebook using a map to store names and phone numbers.
 Allow the user to add, search for, and remove entries.*/
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String,Integer> book = new HashMap<>();
        book.put("James",12345);
        book.put("Charlie",987654);
        book.put("Mark",45673);

        book.put(null , 121212); //Map can have one null key and multiple null values
        book.put("Ramesh", null);
        System.out.println(book);

        int getPhoneNumber = book.get(null); //searching the ph numbers using 'key'
        System.out.println(getPhoneNumber);

        int removeNumber = book.remove("Mark");//removing entries using 'key'

        System.out.println(book);



    }
}
