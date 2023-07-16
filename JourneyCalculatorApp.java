import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter speed");
		double speed=scan.nextDouble();
		System.out.println("Enter time");
		double time=scan.nextDouble();
		
		
		JourneyCalculator journeyCalculator=new JourneyCalculator();
		System.out.println(journeyCalculator.calculateDistance(speed,time));

	}

}
