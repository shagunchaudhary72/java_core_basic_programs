import java.util.Scanner;
import java.util.ArrayList;

public class string_subsets {
    static void findSubset(String str,String curr,int index){
        
//with recursion		
		//if(index==str.length()){
        //    System.out.println(curr);
        //   return;
        //}
        //findSubset(str,curr, index+1);
        //findSubset(str, curr+str.charAt(index), index+1);
		
//Without Recursion
		int len = str.length();  
        int temp = 0;   
        ArrayList<String> al = new ArrayList<>();  
        for(int i=0; i<len; i++) {    
            for(int j=i; j<len; j++) {  
                al.add(str.substring(i, j+1));  
               
            }  
        }
			System.out.println("Possible Subsets  : " + al);
    }
    public static void main(String[] args) {
        System.out.print("enter a String : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        findSubset(str," ",0);
    }
}
