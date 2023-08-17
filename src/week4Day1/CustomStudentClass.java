package week4Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/*Exercise 3: Exercise 1: Custom Class - Student
Create a custom class Student with the following attributes: name (String), age (int), and grade (double).
Implement a Java program that uses an ArrayList to store a list of students and performs the following tasks:

Create and add several student objects to the ArrayList.
Find and print the average grade of all students.
Print the name and age of all students who have a grade higher than 90.*/
public class CustomStudentClass {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("James");
        name.add("Ram");
        name.add("Marri");

        ArrayList<Integer>  age = new ArrayList<>(Arrays.asList(23,42,19));

        ArrayList<Double> grade = new ArrayList<>();
        grade.add(62.5);
        grade.add(73.00);
        grade.add(92.5);
        double sum = 0;
        for( double value : grade){
            sum = sum + value;}
        double average = sum / grade.size();
            System.out.println("Average grade of "+ name + " is " + average );
        }
}

