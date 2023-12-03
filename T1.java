package Project1;

public class T1 {
    public static void main(String[] args) {
  /*
  Create a program that uses an array to store a list of temperatures for a week,
  and then uses a loop to find the highest and lowest temperature for the week.
   */
        int [] temp = {25,28,35,41,45,40,36};
        int highest = temp[0]; // initialize highest to first element of array
        for (int i = 0; i < temp.length; i++) {
            int j = temp[i];
            if (j > highest) { // compare elements of array
                highest = j;
            }
        }
             System.out.println("Highest temperature for the week is "+highest);

         int [] temp1 = {25,28,35,41,45,40,36};
        int low = temp1[0];
        for(int i =0; i<temp1.length; i++)
        { if(low>temp1[i]){
            low=temp1[i];
        }

        }
        System.out.println("Lowest Temperature for the week is "+ low );
    }

}





