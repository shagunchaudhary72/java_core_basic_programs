
import java.util.Scanner;

public class print_natural_numbers {
    
    public static void printReverseNatural(int n) {
        if(n == 0){
            return ;
        }
        System.out.print(n + " ");
        printReverseNatural(n-1);
        
    }
    public static void printNaturalNumbers(int n) {
        if(n == 0){
            return ;
        }
        printNaturalNumbers(n-1);
        System.out.print(n + " ");
        
        
    }
    public static void main(String[] args) {
        System.out.print("Enter a Natural Number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n<=0){
            System.out.println("enter a valid number");
            System.exit(0);
        }
        System.out.print(" Natural Number series  : ");
        printNaturalNumbers(n);
        System.out.print("\n Reverse Natural Number series  : ");
        printReverseNatural(n);
    }
}
