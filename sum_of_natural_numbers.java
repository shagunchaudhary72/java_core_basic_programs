import java.util.Scanner;

public class sum_of_natural_numbers {
    
    // public static int getSum(int n) {

    //     return (n*(n+1))/2;
    // }

//Recursive Solution
        public static int getSum(int n){
            if(n==1){
                return 1;
            }
            return getSum(n-1)+n;
        }
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n<=0){
            System.out.println("Enter a Valid Number");
            System.exit(0);
        }
        System.out.println("Sum is : " + getSum(n));
    }
}
