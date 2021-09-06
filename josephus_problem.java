import java.util.Scanner;

public class josephus_problem {
    static int josephus(int n, int k){
        if(n==1){
            return 0;
        }
        else
        return (josephus(n-1,k)+k)%n;
    }
    static int myJosephus(int n, int k)
    {
    	return josephus(n, k) + 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Total numbers : ");
        int n=sc.nextInt();
        System.out.print("Enter kth number : ");
        int k=sc.nextInt();
        sc.close();
        System.out.print("survived Number is : " + myJosephus(n,k));
    }
}
