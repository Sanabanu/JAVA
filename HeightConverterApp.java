import java.util.Scanner;
public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the height");
		double height=scan.nextDouble();
		HeightConverter converter=new HeightConverter();
		System.out.printf("%.2f",converter.covertInchesToFeet(height));
		

	}

}
