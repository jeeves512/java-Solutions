package helloworld;

public class HelloWorld {
	public static void main (String args[]) {
		System.out.println("hello world");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		helloFriends("Jeevan");
		
		double d = 2.3333;
		float f = 2.555f;
		System.out.print(d + f);
	}
	public static void helloFriends(String s) {
		System.out.println("Hey " + s);
	}
                        
}
