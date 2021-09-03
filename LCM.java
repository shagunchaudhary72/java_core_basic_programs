
import java.util.Scanner;

public class LCM {

//     static int getLCM(int a,int b){
//     int lcm=Math.max(a, b);
//     while(true){
//         if((lcm%a==0)&&(lcm%b==0)){
//             return lcm;
//         }
//         lcm++;
//     }
// }

//using formula    (LCM * HCF = a * b)

    static int getHCF(int a,int b){
        if(b==0){
            return a;
        }
        return getHCF(b, a%b);
    }

    static int getLCM(int a, int b){
        return (a*b)/getHCF(a, b);
    }

public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First Number : ");
    int a=sc.nextInt();
    System.out.println("Enter Second Number : ");
    int b=sc.nextInt();
    sc.close();
    if((a<=0)||(b<=0)){
        System.out.println("Enter Valid NUmber");
        System.exit(0);
    }
    System.out.println("LCM is : " + getLCM(a,b));
}
}