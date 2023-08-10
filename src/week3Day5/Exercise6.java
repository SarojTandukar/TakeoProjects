package week3Day5;
/*Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)


        fizzString("fig") → "Fizz"
        fizzString("dib") → "Buzz"
        fizzString("fib") → "FizzBuzz"*/
public class Exercise6 {
    public static void main(String[] args) {
       String [] str = {"Fizz","Buzz"};
         String f = str[0];
         String b = str[1];

               for (int i = 0; i < str.length; i++) {
                //System.out.println(i);
                if (f.equals(str[i])) {
                    System.out.println("Fizz");
                }  if (b.equals(str[str.length-1])) {
                    System.out.println("Buzz");
                }
                if(f.equals(str[i]) && b.equals(str[str.length-1])){
                    System.out.println("FizzBuzz");
                    break;
                   }

            }
    }
}
