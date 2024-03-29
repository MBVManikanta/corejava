package exceptionhandling;

import java.util.Scanner;

public class MyTest extends Exception {
public MyTest(String msg) {
	super(msg);
	
}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Amount");
int amount=sc.nextInt();
if(amount<10000) {
try {
	MyTest obj=new MyTest("Insufficient Balance");
	throw obj ;
}
catch(MyTest m) {
	m.printStackTrace();
}

}

	}

}
