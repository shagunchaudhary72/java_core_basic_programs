
    import java.util.Scanner;

    public class checking_power_of_two {
    
        static boolean checkPower(int n){
            // if(n==0){
            //     return false;
            // }
            // while(n!=1){
            //     if(n%2 != 0)
            //     return false;
            //     n=n/2;
            // }
            // return true;
     
            return ((n!=0) && ((n & (n-1))==0));
        }
    
         public static void main(String[] args) {
              System.out.println("Enter a Number : ");
              Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              sc.close();
              if(checkPower(n))
              System.out.println("This number  is a Power of 2");
              else
              System.out.println("This Number is not a power of 2");
                 }
    }
    
    