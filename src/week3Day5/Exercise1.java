package week3Day5;
/*Given two int values, return their sum. Unless the two values are the same, then return double their sum.

        sumDouble(1, 2) → 3
        sumDouble(3, 2) → 5
        sumDouble(2, 2) → 8*/
public class Exercise1 {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;


        if(a==b ){
            System.out.println(2*(a+b));
        }
        else{
            System.out.println(a+b);
        }




    }
}
