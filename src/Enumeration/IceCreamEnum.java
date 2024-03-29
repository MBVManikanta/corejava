package Enumeration;

import java.util.Scanner;

enum IceCream{
	//constants in enum, each with one value
	Vanilla(20.00),Chocolate(22.50),Strawbery(23.00);
	private double Price;//instance variable
	IceCream(double Price) {//constructor
		this.Price=Price;
	}
	static void getPrice(int i) {//user defined method
		IceCream[] creams=IceCream.values();
		System.out.println("Pay RS:"+creams[i].Price);
	}
}
public class IceCreamEnum {

	public static void main(String[] args) {
		System.out.println("Avaliable IceCream");
		for(IceCream cream:IceCream.values()) {
			int no=cream.ordinal();//returns index position
			System.out.println(no+" "+cream);
		}
		//get the user choice as a number
		System.out.println("select the ice cream by using its number");
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		IceCream.getPrice(choice);
	}

}
