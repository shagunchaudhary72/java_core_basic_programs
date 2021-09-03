
import java.util.Scanner;

public class PrimeFactors {

    static void getPrimeFactors(int n){
        if(n==0 || n==1) return;
        System.out.println("Prime Factors Are : ");
        for(int i=2; i*i<=n; i++){

            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        if(n>1) System.out.println(n);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        sc.close();
      getPrimeFactors(n);
    }
    
}
