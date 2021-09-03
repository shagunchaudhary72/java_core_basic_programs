import java.util.Scanner;

public class divisors_of_number{

    static void getDivisors(int n){

        if(n==0) return;
        int divisors=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
                divisors++;
            }
        }
        System.out.println("TOtal Divisors are : " + divisors);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        sc.close();
        getDivisors(n);
    }
    
}