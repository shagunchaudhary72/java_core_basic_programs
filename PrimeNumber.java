
import java.util.Scanner;

public class PrimeNumber {

    static boolean checkPrime(int n){
        // if(n==0 || n==1) return false;

        // else if(n==2) return true;

        // else 
        // //for(int i=2; (i*i)<=n; i++)
        // for(int i=2; i<=(n/2); i++) 
        //         if(n%i==0)
        //             return false;
        // return true;
//OPtimised Solution 
        if(n==0 || n==1) return false;

        if(n==2 || n==3) return true;

	if(n%2==0 || n%3==0 ) return false;

        for(int i=5; i*i<=n; i=i+6)
            if((n%i==0) || (n%(i+2))==0) 
                return false;
        return true;
    
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a=sc.nextInt();
        sc.close();
        boolean x=checkPrime(a);
        if(x){
            System.out.println("It is a Prime NUmber ");
        }else{
            System.out.println("Not a Prime Number ");
        }

        
    }
    
}