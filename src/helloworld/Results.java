package helloworld;

public class Results {
	public static void main(String[] args) {
		double physics = 150;
		double chemistry = 150;
		double biology = 150;
		double total =  physics +chemistry + biology;
		double percentage = (total/450) *100;
		
		displayResults(physics, chemistry, biology, total);
		displayPercentage(percentage);
	}
	
	public static void displayResults(double physics, double chemistry, double biology, double total) {
		System.out.println("Physics: " + physics);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Biology: " + biology);
		System.out.println("Total: " + total);
		
	}
	
	public static void displayPercentage(double percentage) {
		System.out.println("Percentage: " + percentage);
	}
}
