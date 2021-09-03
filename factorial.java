import java.util.Scanner;

public class factorial {

//Iterative Solution

//     static int getFactorial(int n){

//         int fact=1;
 
//         if(n<0){

//         System.out.println("Enter a Valid Number");

//         System.exit(0);
//         }
        
//         else if(n==0){

//         return 1;
//         }
//         else{

//         for(int i=n; i>0; i--){

//             fact=fact*i;
//         }
        
//     }
//     return fact;
// }

//Recursive Solution

        // static int getFactorial(int n){
            
        //     if(n<0){

        //         System.out.println("Enter a Valid Number  ");

        //         System.exit(0);
        //     }
        //     if(n==0 || n==1){
        //         return 1;
        //     }
        //     else{

        //         return getFactorial(n-1)*n;
        //     }
        // }

//Tail Recursive Solution
            public static int getFactorial(int n,int k){
                if(n==0 || n==1){
                    return k;
                }
                
                return getFactorial(n-1, k*n);

            }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number : ");

        int n=sc.nextInt();

        

        sc.close();

        //System.out.println("Factortial of "+ n + " is : " + getFactorial(n));
        System.out.print("Factorial is : " + getFactorial(n, 1));
    }
    
}