package assignment3;

public class FizzBizz {
    public static void main(String[] args) {
        int limit = 15;

        for (int i = 1; i <= 15; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
    }

