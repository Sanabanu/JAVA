
public class Operations {

	public static void main(String[] args) {
		int res1=substractNumbers(20,5);
		System.out.println(res1);
		int res2=multiplyNumbers(4, 5);
		System.out.println(res2);

		double res3=divideNumbers(20, 4);
		System.out.println(res3);

		int res4=remainderNumbers(10, 3);
		System.out.println(res4);
		

	}
	public static int substractNumbers(int num1,int num2)
	{
		return num1-num2;
		
	}
	public static int multiplyNumbers(int num1,int num2)
	{
		return num1*num2;
	}
	public static double divideNumbers(double num1,double num2)
	{
		return num1/num2;
	}
	public static int remainderNumbers(int num1,int num2)
	{
		return num1%num2;
	}

}
