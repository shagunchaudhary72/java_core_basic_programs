import java.util.Scanner;

public class string_palindrome {
    
    //  static boolean checkPalindrome(String str){
    //     String str2=str;
    //     StringBuilder sb=new StringBuilder(str);
    //     sb.reverse();

    //     return str2.equals(sb.toString());

    // }

//Recursive Solution

        static boolean checkPalindrome(String str, int start,int end){
                if(start>=end){
                    return true;
                }
                return (str.charAt(start)==str.charAt(end) && checkPalindrome(str, start+1, end-1) );
        }
    public static void main(String[] args) {
        System.out.print("enter a string : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        if(checkPalindrome(str,0,str.length()-1)){
            System.out.println("this String is a Plaindrome");
        }
        else{
            System.out.println("this String is not a Palindrome");
        }
    }
}
