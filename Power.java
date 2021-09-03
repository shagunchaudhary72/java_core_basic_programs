import java.util.Scanner;

public class Power {

    static int getPower(int x,int p){

        // int result=1;
        // for(int i=0; i<p; i++){
        //     result=result*x;
        // }
        // return result;
 //Optimised Solution
            if(p==0)   return 1;
           
            int res=getPower(x, p/2);

            res=res*res;

            if(x%2==0)  return res;
            else return res*x;
            
 
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number : ");

        int x=sc.nextInt();
        System.out.println("Enter Power : ");

        int p=sc.nextInt();
        
        sc.close();

        System.out.println(getPower(x,p));
    }
    
}