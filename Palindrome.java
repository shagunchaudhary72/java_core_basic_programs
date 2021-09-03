
import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(int n){
        int rev=0;
        int number=n;
        int rem;
        while(n!=0){
            rem=n%10;
            rev=(rev*10) + rem;
            n/=10;
        }
        if(number==rev)
        return true;
        else return false;
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number : ");

        int n=sc.nextInt();
        sc.close();

        if(isPalindrome(n))
        
        System.out.println(n +" "+ "is a Palindrome");

        else

        System.out.println(n +" " + "is not a Palindrome");
    }
}
