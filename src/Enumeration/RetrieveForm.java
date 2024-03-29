package Enumeration;
enum Directions{
	  North,East,West,South;
  }
public class RetrieveForm {

	public static void main(String[] args) {
		Directions[] d=Directions.values();
		System.out.println("News stand For");
        for(Directions dir:d)
        	System.out.println(dir);
	}

}
