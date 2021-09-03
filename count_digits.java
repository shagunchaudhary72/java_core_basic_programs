import java.util.Scanner;

public class count_digits{
//iterative solution

    // static int getDigits(int n){
    //     int count=0;
    //     if(n==0){
    //         return 1;
    //     }else{
    //         while(n!=0){
    //             n/=10;
    //             count++;
    //         }
    //         return count;
    //     }
    
    // }
//Recursive Solution

        static int getDigits(int n){
            if(n==0)
            return 1;
            else
            return 1+getDigits(n/10);
        }


    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        n=sc.nextInt();
        int digits=getDigits(n);
        System.out.println("Total Number of Digits : " + digits);
        sc.close();
    }
}