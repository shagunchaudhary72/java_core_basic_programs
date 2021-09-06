import java.util.Scanner;

public class count_subsets {
    static int totalSubsets(int arr[],int n,int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return totalSubsets(arr, n-1, sum) + totalSubsets(arr, n-1, sum - arr[n-1]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        System.out.print("Enter elements of array : ");
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Sum of subset : ");
        int sum=sc.nextInt();
        sc.close();
        System.out.print("Total Possible Subsets are : "+ totalSubsets(arr, n, sum));
    }
}
