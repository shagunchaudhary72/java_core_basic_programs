import java.util.Scanner;

public class count_set_bits {

    static int countBits(int n){
        int count=0;
        while(n>0){
            // if((n & 1)==1)
            // count++;
            // n=n>>1;
        //Brian Kernigam's Algorithm
            n= (n & (n-1));
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        sc.close();
        System.out.println("Total Sets Bits are : " + countBits(n));
    }
    
}
