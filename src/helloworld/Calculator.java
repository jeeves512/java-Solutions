package helloworld;

public class Calculator {
	public static void main(String[] args) {
		int sum = sumTwoInt(1,2);
		int product = productTwoInt(2,3);
		System.out.println(sum);
		System.out.println(product);
		System.out.println(subtractTwoInt(2,3));
		System.out.println(divideTwoInt(6,3));
	}
	
	public static int sumTwoInt(int num1, int num2) {
		return(num1 + num2);
	}
	
	public static int productTwoInt(int num1, int num2) {
		return(num1 * num2);
	}
	public static int subtractTwoInt(int num1, int num2) {
		return(num1 - num2);
	}
	public static double divideTwoInt(double num1, double num2) {
		if(num1<num2) {
			return(num1/num2);
		}
		System.out.println("Division cannot be performed");
		return 0;
	}
}
