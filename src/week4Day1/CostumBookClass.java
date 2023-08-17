package week4Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/*Exercise 4: Exercise 2: Custom Class - Book
Create a custom class Book with the following attributes: title (String), author (String), and yearPublished (int).
 Implement a Java program that uses an ArrayList to store a list of books and performs the following tasks:

Create and add several book objects to the ArrayList.
Find and print all books published after a given year (e.g., 2000).*/
 public class CostumBookClass {
    private String title;
    private String author;
    private int yearPublished;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "Title :" + title + ", Author: " + author + " , Year Published :" + yearPublished;
    }


    public static void main(String[] args) {

        ArrayList <String> arrList = new ArrayList<>();

    }


}
