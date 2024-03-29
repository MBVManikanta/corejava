package scannerobject;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two digit number");
		int n=sc.nextInt();
		int fnumber=n/10;
		int snumber=n%10;
		int c=fnumber+snumber;
		System.out.println("sum of 2 digits="+c);
	}

}
