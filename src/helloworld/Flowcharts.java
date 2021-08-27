package helloworld;

public class Flowcharts {
	public static void main(String[] args) {
		System.out.println(mathOperator(4,2,true));
		System.out.println(mathOperator(4,2,false));
		flowChartOne(400);
		System.out.println("BlackJack");
		System.out.println(blackJack(20,21));
		System.out.println(blackJack(21,21));
		System.out.println(blackJack(21,19));
		System.out.println(blackJack(22,26));
		System.out.println("uniqueSum");
		System.out.println(uniqueSum(1,1,1));
		System.out.println(uniqueSum(1,1,3));
		System.out.println(uniqueSum(3,1,1));
		System.out.println(uniqueSum(1,3,1));
		System.out.println(uniqueSum(1,2,3));
	}
	
	public static int mathOperator(int num1, int num2, boolean getSum ) {
		if(getSum) {
			return num1+num2;
		}
		return num1*num2;
	}
	public static void flowChartOne(int input) {
		if(input >2000) {
			System.out.println("A");
			if(input >6000) {
				System.out.println("C");
			} else {
				System.out.println("Print B");
				if(input>4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		}
		else {
			System.out.println("1");
			if(input >100) {
				System.out.println("3");
				if(input > 600) {
					System.out.println("5");
				}else {
					System.out.println(4);
					if(input >500) {
						System.out.println("6");
					}else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}
	
	public static int blackJack(int num1, int num2) {
		if(num1 >0 ||num2 >0) {
			if(num1>21 && num2>21) return 0;
			if(num1>21) return num2;
			if(num2>21) return num1;
			if((21-num1)<(21-num2)) {
				return num1;
			} else {
				return num2;
			}
		}
		
		return 0;
	}
	
	public static int uniqueSum(int num1, int num2, int num3) {
		if(num1 == num2 && num2 == num3) return 0;
		if(num1 == num2 ) return num3;
		if(num1 == num3 ) return num2;
		if(num2 == num3 ) return num1;
		return num1 + num2 + num3;
	}
	
	public static int greatestCommonDivisor(int n1, int n2) {
		int min = Math.min(n1, n2);
		for(int i = min; i < n1*n2; i++ ) {
			//if()
		}
		return 0;
	}
}
