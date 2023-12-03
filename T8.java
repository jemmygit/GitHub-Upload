package Project1;

public class T8 {
    public static void main(String[] args) {
        /*
        Maximum and minimum number in the array?
         */
        int[] numbers = {5, 1, 2, 3, 4, 55, 18, 7};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number is "+ max);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number is "+ min);
    }
}
