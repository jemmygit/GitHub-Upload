package Project1;

public class T10 {
    public static void main(String[] args) {
        /*
        Write a program to print out duplicate elements from an Array of Strings?
         */

        int [] numbers = {1,2,3,4,2,7,8,8,3};

        System.out.println("Duplicate elements is the given Array : ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i]==numbers[j])
                    System.out.println(numbers[j]);
                }
            }
        }
    }
