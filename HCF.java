import java.util.Scanner;

public class HCF{

//Using While Loop    
    // static int getHCF(int a, int b){
    //     int hcf=Math.min(a, b);
    //     while(hcf>0){
    //         if((a%hcf==0) && (b%hcf==0)){
    //             break;
    //         }
    //         hcf--;
    //     }
    //    return hcf;
    // }

//Using Eucledian Theorem

        static int getHCF(int a, int b){

            // while(a!=b){
            //     if(a>b){
            //         a=a-b;
            //     }else{
            //         b=b-a;
            //     }
            // }
            // return a;
            if(b==0){
                return a;
            }
            return getHCF(b, a%b);
        }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b=sc.nextInt();
        if(a<=0 || b<=0){
            System.out.println("Enter Valid Numbers");
            System.exit(0);
        }
        sc.close();
        System.out.println("HCF is :  "+ getHCF(a, b));
    }
}