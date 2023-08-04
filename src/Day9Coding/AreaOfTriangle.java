package Day9Coding;

import java.util.Scanner;

/*Exercise 2: Write a java program that takes the base and height of a triangle and return its area.(area of triangle = (base*height)/2)

        Ex :
        triArea(3, 2) ➞ 3*/
public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Base of the Triangle:");
        double base = sc.nextDouble();

        System.out.println("Height of the Triangle:");
        double height = sc.nextDouble();

        double areaOfTriangle = base * height/2;
        System.out.println("The Area of Triangle is : "+ areaOfTriangle);



    }

}
