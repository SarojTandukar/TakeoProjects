package week3Day4;
/*Exercise 4: Write an application that reads two integers, determines whether the first is a multiple of the second and
Ex : 5,10 : yes
prints the result. [Hint: Use the remainder operator.]*/
public class Exercise4 {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        if(10%5==0){
            System.out.println("First element is multiple of second.");
        }
        else{
            System.out.println("First element is not multiple of the second element");
        }
    }
}
