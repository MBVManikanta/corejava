package javastringformatspecifiers;

//public class FormatDemo {
//
//	public static void main(String[] args) {
//		System.out.println(String.format("%d",65));
//		System.out.println(String.format("%f",3.14));
//		System.out.println(String.format("%o",12));
//		System.out.println(String.format("%s","hello world"));
//		System.out.println(String.format("%c",'k'));
//		System.out.println(String.format("%x",14));
//		System.out.println(String.format("%h","hello"));
//		String s1="Get the job";
//		System.out.println(String.format("you will %s",s1));
		
		
		
		public class FormatDemo {

		    public static void main(String[] args) {
		        System.out.println(String.format("%d", 65)); // Prints: 65
		        System.out.println(String.format("%f", 3.14)); // Prints: 3.140000
		        System.out.println(String.format("%o", 12)); // Prints: 14
		        System.out.println(String.format("%s", "hello world")); // Prints: hello world
		        System.out.println(String.format("%c", 'k')); // Prints: k
		        System.out.println(String.format("%x", 14)); // Prints: e
		        System.out.println(String.format("%h", "hello")); // Prints: 2cfb8c7b
		        String s1 = "Get the job";
		        System.out.println(String.format("you will %s", s1)); // Prints: you will Get the job
		    }
		}

//	}
//
//}
  