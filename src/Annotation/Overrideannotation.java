package Annotation;
class  Parent{
	public void m1() {
		System.out.println("i am parent method");
	}
}
class Child extends Parent{
	@Override
	public void m1() {
		System.out.println("i am child method");
	}
}
public class Overrideannotation {

	public static void main(String[] args) {
		Child r1=new Child();
		r1.m1();
		Parent r2=new Parent();
		r2.m1();

	}

}
