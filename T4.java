package Project1;

public class T4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers. Develop a program which will calculate the
        sum of even and odd numbers for that array.
         */
        int[][] numbers = {{1,2,3,4},
                           {5,6,7,8}
                                    };
        int Odd = 0;
        int Even = 0;
        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j<numbers[i].length; j++){
                if (numbers[i][j]%2==0){
                Even=Even+numbers[i][j];
                }
                if(numbers[i][j]%2!=0){
                Odd= Odd+numbers[i][j];
                }

            }
        }
        System.out.println(Even);
        System.out.println(Odd);

    }
}
