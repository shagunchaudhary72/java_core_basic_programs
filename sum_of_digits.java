import java.util.Scanner;

public class sum_of_digits {

    static int sumDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumDigits(n/10);
    }


    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.print("sum of digits : " + sumDigits(n));    
    }
}
