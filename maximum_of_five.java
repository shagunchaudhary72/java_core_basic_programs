import java.util.Scanner;

class maximum_of_five{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter five Numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4= sc.nextInt();
		int n5 = sc.nextInt();
		int smallest = n1;
		if( smallest > n2)
			smallest = n2;
		if( smallest > n3)
			smallest = n3;
		if( smallest > n4 )
			smallest = n4;
		if( smallest > n5 )
			smallest = n5;
		System.out.println(smallest +" is the Smallest Number ");
	}
}