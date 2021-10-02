import java.util.Scanner;

class check_leap_year{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Year : ");
		int year = sc.nextInt();
		if( (year % 400 == 0) || ( (year % 100 != 0 )&&( year % 4 == 0)))
			System.out.println(year +" is a Leap Year");
		else
			System.out.println(year +" is not a Leap Year");
	}
}