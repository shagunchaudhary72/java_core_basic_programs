import java.util.Scanner;

public class tower_of_hanoi {

    static void totalMoves(int n,char A,char B,char C){
        if(n==1){
            System.out.println("Move 1 from "+ A +" to " + C);
            return;
        }
        totalMoves(n-1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        totalMoves(n-1, B, A, C);
    }
    public static void main(String[] args) {
        System.out.print("Enter total number of discs : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        totalMoves(n,'A','B','C');
    }
}
