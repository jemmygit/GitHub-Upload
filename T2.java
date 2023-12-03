package Project1;

public class T2 {
    public static void main(String[] args) {
        /*
        Create an array of integer values. After the array is created, calculate the
        sum of all stored elements in that array.
         */
        int[] values = {10,20,30,40,50,60};
        int sum =0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        System.out.println(sum);
        }
    }

