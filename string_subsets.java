import java.util.Scanner;

public class string_subsets {
    static void findSubset(String str,String curr,int index){
        if(index==str.length()){
            System.out.println(curr);
            return;
        }
        findSubset(str,curr, index+1);
        findSubset(str, curr+str.charAt(index), index+1);
    }
    public static void main(String[] args) {
        System.out.print("enter a String : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        findSubset(str," ",0);
    }
}
