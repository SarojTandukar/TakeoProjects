package week3Day5;
/*Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.


        array667([6, 6, 2]) → 1
        array667([6, 6, 2, 6]) → 1
        array667([6, 7, 2, 6]) → 1*/
public class Exercise4 {
    public static void main(String[] args) {
        int [] a = {6,6,2,6};

        for(int i =0; i<a.length;i++){
            for(int j = 1; j<a.length ;j++){
                if (a[i] == a[j]) {

                    System.out.println("Six are next to each other");
                    break;
                }
                }
            }

        }

    }

