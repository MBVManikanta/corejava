package exceptionhandling;

import java.util.Scanner;
//java program with handling an exception using try and catch blocks
public class Exception2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("file opened");
		System.out.println("Enter the first number");
		int fno=sc.nextInt();
		System.out.println("Enter the second number");
        int sno=sc.nextInt();
        try {
        double division=fno/sno;
        System.out.println("Division="+division);
        }
        catch(Exception e) {
        	e.printStackTrace();//used to display exception description to the user
        System.out.println("Don't Enter second number as zero");
        }
       System.out.println("close the file");
	}

}
