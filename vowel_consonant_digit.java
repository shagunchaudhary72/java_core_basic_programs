import java.util.Scanner;

class vowel_consonant_digit{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char ch = sc.next().charAt(0);
		if( (int)ch >= 97 && (int)ch <= 122 ){
			switch(ch){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':	System.out.println("Entererd Character is a Vowel ");
							break;
				default :	System.out.println("Entered Character is a Consonant ");
			}
		}else if( (int)ch >= 48 && (int)ch <=57 ){
			System.out.println("Numerical Digit");
		}else{
			System.out.println("Other Character ");
		}
	}
}