import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=scan.nextInt();
		System.out.println(cubeNumber(num));
		

	}
	public static int cubeNumber(int num)
	{
		return num*num*num;
	}

}
