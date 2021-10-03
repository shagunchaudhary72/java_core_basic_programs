
//Write a program to find the length of a string without using the library function?

import java.util.Scanner;

class string_length_without_function{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		char[] charArray = str.toCharArray();
		int length = 0;
		for(char ch : charArray){
			length++;
		}
		System.out.println("Length of String : " + length);
	}
}