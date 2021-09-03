import java.util.Arrays;
import java.util.Scanner;

public class Sieve_of_Eratosthenes {
    
    static boolean checkPrime(int n){
        if(n==0 || n==1) return false;

        else if(n==2) return true;

        else 
        //for(int i=0; (i*i)<=n; i++)
        for(int i=2; i<=(n/2); i++) 
                if(n%i==0)
                    return false;
        return true;
    }

    static void getPrime(int n){

         if(n<2){
              System.out.println("Prime Number Doesn't Exist");
                return;
            }
        // for(int i=2; i<=n; i++){
        //     if(checkPrime(i)){
        //         System.out.println(i);
        //     }
        // }

 // Optimised Solution 
    boolean isPrime[] = new boolean[n+1];

    Arrays.fill(isPrime, true);
    for(int i=2; i<=n; i++){
        if(isPrime[i]){
            System.out.print(i + " ");
            for(int j=i*i; j<=n; j=j+i){
                isPrime[j]=false;
            }
        }
    }       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        sc.close();
        getPrime(n);
    }
}
