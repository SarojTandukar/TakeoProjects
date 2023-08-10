package week3Day5;
/*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

        makes10(9, 10) → true
        makes10(9, 9) → false
        makes10(1, 9) → true*/
public class Exercise2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 9;

        if(a==10 ||b==10 || a+b==10){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
