import java.util.Scanner;

public class FibonacciSeries {


   // static void getSeries(int n){ //where 'n' is total number of terms 
   //using Simple Variables     
    // int a=0, b=1, c;
       
    // System.out.println("Fibonacci Series Using Variables :");
        
    // for(int i=0;i<n;i++){
            
    //     System.out.println(a + " ");

    //     c=a+b;
           
    //     a=b;
           
    //     b=c;
  
    // } 
    // }
    // int counter=0;
    // System.out.println("Fibonacci Series Using Variables :");
      //a=0;b=1;c=0;  
    // while(counter<=n){
    //     System.out.println(a + " ");
    //     c=a+b;
    //     a=b;
    //     b=c;
    //     counter++;
    //}    

//using Array
    //     System.out.println("Fibonacci Series Using Array : \n");
    // int[] a=new int[n];
    // a[0]=0;
    // a[1]=1;
  
    // System.out.println(a[0] +"\n"+ a[1]);
    // for(int i=2;i<n;i++){
        
    //     a[i]=a[i-1]+a[i-2];
    //     System.out.println(a[i]);
     
    // }

//using Recursion
    //}

    static int getSeries(int n){
        if(n<=1)
        return n;
        
        return getSeries(n-1)+getSeries(n-2);
    }


     public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);

    System.out.println("Enter Total Terms :");

    int n=sc.nextInt();

    sc.close();

    //getSeries(n);
    System.out.println("Fibonacci Series Using Reccursion : ");  
    for(int i=0;i<n;i++){
        System.out.print(getSeries(i) + " ");
    }

    }
}



