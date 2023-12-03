package Project1;

public class T7 {
    public static void main(String[] args) {
        /*
        Write a Java Program to print the first 10 numbers of Fibonacci series.
The Fibonacci sequence is a set of integers (the Fibonacci numbers) that starts with a zero,
followed by a one, then by another one, and then by a series of steadily increasing numbers.
The sequence follows the rule that each number is equal to the sum of the preceding two numbers
         */
        // first  = 0  second = 1  next = first + second and so on

        int numbers = 10; int first = 0; int second = 1;
        System.out.println("the first " +  numbers  + " numbers of Fibonacci series:" );
        for (int i = 1; i <= numbers; i++) {
            System.out.print(first+ " ");
            int next = first + second;
            first=second;
            second=next;

        }

        };
    }

