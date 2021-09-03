import java.util.Scanner;

public class check_set_bit {
    
    static boolean checkBit(int n, int k){
    //Using Left Shift Operator

        if(((1<<(k-1))&n)==0)

    //Using Right Shift Operator
    
        //if((1&(n>>(k-1)))==0)
        {
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        System.out.println("Enter the Bit for checking : ");
        int k=sc.nextInt();
        sc.close();
        if(k<=0)
        {
            System.out.println("enter Valid bit");
            return;
        }
        if(checkBit(n,k)){
        System.out.println("yes Bit is set");
        }else{
            System.out.println("NO Bit is not set");
        }
    }
}

