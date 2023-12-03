package Project1;

public class T9 {
    public static void main(String[] args) {
        /*
        Write a java program to find the second-largest number in the array?
         */ // swap to get second large number in array and compare to all array elements
        int [] numbers = {1,2,3,4,35,6,7,50,23};
        int firstLargest  = 0;
        int secondLargest = 0;
        if(numbers[0]>numbers[1]){
            firstLargest = numbers[0];
            secondLargest = numbers[1];
        } else {
            firstLargest= numbers[1];
            secondLargest= numbers[0];
        }
        for (int i = 2; i < numbers.length; i++){
            if(numbers[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = numbers[i];
            } else if (secondLargest<numbers[i]){
                secondLargest=numbers[i];
            }
        }
        System.out.println("Second Largest number in Array is "+ secondLargest);


        }


    }

