import java.util.Scanner;

public class MessageDecoderApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Character");
		char c=scan.next().charAt(0);
		MessageDecoder decoder =new MessageDecoder();
		System.out.println(decoder.decodeCharacter(c));

}
}
