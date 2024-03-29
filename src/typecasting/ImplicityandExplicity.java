package typecasting;

public class ImplicityandExplicity {

	public static void main(String[] args) {
		byte b=15;
		int x=b;
		System.out.println("x="+x);
		int a=135;
		byte b1=(byte)a;
		System.out.println(b1);
        float f1=a;
        System.out.println(f1);
        float f2=46.89f;
        int c=(int)f2;
        System.out.println(c);
	}

}
