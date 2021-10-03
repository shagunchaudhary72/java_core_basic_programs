
// Write a program to check whether a given number is a Strong Number or not?
//Note : If sum of factorial of each digit of a number is equal to that number, then that number is called strong number.

import java.util.Scanner;

class check_strong_number{
	static int factorial(int n){
		int fact = 1;
		while( n != 0){
			fact = fact * n;
			n--;
		}
		return fact;
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Positive Number : ");
		int n = sc.nextInt();
		int strong = 0;
		int num = n;
		int rem;
		while( n != 0){
			rem = n%10;
			strong = strong + factorial(rem);
			n /= 10;
		}
		if( strong == num ){
			System.out.println("It is a Strong Number");
		}else{
			System.out.println("Not a Strong Number");
		}
	}
}