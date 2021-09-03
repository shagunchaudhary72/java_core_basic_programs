
import java.util.Scanner;

public class Trailing_zeros_in_factorial {

 //This is not space Efficient Solution
    //  static int getZeros(int n ){

    //     if(n<0){

    //         System.out.println("Enter a Valid Number : ");

    //         System.exit(0);
    //     }
    //     long fact=1;

    //     if(n==0){

    //         fact=1;
    //     }
    //     else{
    //         for(int i=n; i>0; i--){

    //             fact*=i;
    //         }
    //     }
    //     int count=0;
    //     while(fact%10==0){

    //     count++;

    //     fact/=10;
    //     }

    //     return count;
    // }

    static int getZeros(int n ){

        int zeros=0;

        for(int i=5; i<=n; i=i*5){

            zeros = zeros + n/i ;
        }

        return zeros;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number : ");

        int n = sc.nextInt();

        sc.close();

        System.out.println("Trailing Zeros in "+ n + " "+ "is  :  "+ getZeros(n));
        }
    
}
