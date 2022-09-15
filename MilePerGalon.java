import java.util.Scanner;

public class MilePerGalon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of miles driven: ");
		double m = scan.nextDouble();
		
		System.out.println("Enter the number of gallons in the tank: ");
		int g = scan.nextInt();
		
		m /= g;
		System.out.println("The MPG is " + m);
	}

}
