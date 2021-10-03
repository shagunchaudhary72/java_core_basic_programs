
//Write a program to check whether a given number is an armstrong number or not?

import java.util.Scanner;

class check_armstrong_number{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Positive Number : ");
		int n = sc.nextInt();
		int num = n;
		int sum = 0;
		int r = 0;
		while( n != 0){
			r = n%10;
			sum += Math.pow(r,3);
			n /= 10;
		}
		if( sum == num ){
			System.out.println("It is an Armstrong Number");
		}else{
			System.out.println("It is not an Armstrong Number");
		}
	}
}