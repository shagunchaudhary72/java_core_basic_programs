
import java.util.Scanner;

public class print_binary_equivalent {
    
    public static void printBinary(int num){
        if(num == 0){
            return ;
        }
        printBinary(num/2);
        System.out.print(num%2);
    }
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.print("Binary Equivalent : ");
        printBinary(num);
    }
}
