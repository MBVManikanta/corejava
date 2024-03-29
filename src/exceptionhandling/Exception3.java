package exceptionhandling;

import java.util.Scanner;

//java program with handling an exception using try,catch and finally blocks
public class Exception3 {

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
        catch(ArrayIndexOutOfBoundsException e) {
        	e.printStackTrace();//used to display exception description to the user
        }
        finally {
        	sc.close();
            System.out.println("Iam finally");
        }
       System.out.println("close the file");

	}

}
