package Project1;

public class T3 {
    public static void main(String[] args) {

   /*
   Create a 2D array or integer type where you will store odd and even
   numbers. Develop a program which will identify/print the even numbers only.
    */
        int [][] values = {{10,25,30},
                           {20,35,40},
                           {30,45,50}
                                      };
        for (int[] value : values) {
            for (int i : value) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }

            }
        }

    }
}
