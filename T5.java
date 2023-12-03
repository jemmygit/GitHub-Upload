package Project1;

public class T5 {
    public static void main(String[] args) {
        /*
        Write a program to swap 2 numbers without a temporary variable?
        means to change value of X to be Y and Y to be X
         */

        int n = 10;
        int m = 7;
        n= n+m;
        m= n-m;
        n= n-m;
        System.out.println("After Swapping numbers "+ " n = "+ n + " m = "+ m );

    }
}
