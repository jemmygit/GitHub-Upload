package Project1;

public class T6 {
    public static void main(String[] args) {
        /*
        Write a java program to check whether a given number is prime or not?
         */
 // prime number is a number divisible by itself and 1 except 2  and give you whole number
        int n = 29; // 3 7 11 13 etc...
        boolean IsPrime=true;
        for(int i =2 ; i<=n/2; i++){
            if(n%i==0){
                IsPrime=false;
                break;
            }
        }
        if(IsPrime){
            System.out.println(n +" Number is Prime");
        } else {
            System.out.println(n +" Number is not prime");
        }
    }
}
