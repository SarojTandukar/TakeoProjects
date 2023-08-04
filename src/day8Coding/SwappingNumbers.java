package day8Coding;

public class SwappingNumbers {
    public static void main(String[] args) {

        int x = 4;
        int y = 7;

        System.out.println("Before Swapping" + " x = 4" + " and " + "y=7");

       int a = x;
        x = y;
        y = a;
        System.out.println("After Swapping");
        System.out.println("x = " + x);
        System.out.println("y = " + y);



    }
}
