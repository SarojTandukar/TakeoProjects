package week3Day5;
/*Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


        twoAsOne(1, 2, 3) → true
        twoAsOne(3, 1, 2) → true
        twoAsOne(3, 2, 2) → false*/
public class Exercise8 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        if(a+b==3 || b+a==3 ){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
