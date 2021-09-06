import java.util.Scanner;

public class rope_cutting_problrm {

    static int maxRopes(int l,int a,int b,int c){
        if(l<0){
            return -1;
        }
        if(l==0){
            return 0;
        }
        int result=Math.max(maxRopes(l-a,a,b,c),
                 Math.max(maxRopes(l-b, a, b, c),
                 maxRopes(l-c, a, b, c)));
            if(result== -1){
                return -1;
            }
            return result+1;
    }
   public static void main(String[] args) {
       System.out.print("Enter length of rope : ");
       Scanner sc=new Scanner(System.in);
       int l=sc.nextInt();
       System.out.print("enter length of three pieces : ");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       sc.close();
       System.out.println("maximum possible ropes are : " + maxRopes(l,a,b,c));
   } 
}
