package exceptionhandling;
//java program without handling an exception
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("file opened");
		System.out.println("Enter the first number");
		int fno=sc.nextInt();
		System.out.println("Enter the second number");
        int sno=sc.nextInt();
        double division=fno/sno;
        System.out.println("Division="+division);
        System.out.println("close the file");
        sc.close();
        }
    }
