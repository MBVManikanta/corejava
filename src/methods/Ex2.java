package methods;

public class Ex2 {
     public int add(int x,int y) {
    	 int sum=x+y;
    	 return sum;
     }
	public static void main(String[] args) {
		Ex2 obj=new Ex2();
		int r1=obj.add(20,30);
		System.out.println(r1);
		int r2=obj.add(12,66);
        System.out.println(r2);
	}

}
