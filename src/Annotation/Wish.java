package Annotation;

public class Wish {
    @Deprecated
    public void msg() {
    	System.out.println("hello brother how are you");
    }
	public static void main(String[] args) {
		Wish obj=new Wish();
		obj.msg();
	}

}
