package algorithm;
import java.util.Scanner;

public class ToBinary {
	public static String tobinary(int num) {
		// binary number store in blank string value
		String binary="";
		while(num>0)
		{
			binary = (num%2)+binary;
			num = num/2;
		}
		while(binary.length()%4!=0) {
			binary = '0'+binary;
		}
		return binary;
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = scanner.nextInt();
		String value = tobinary(num);
		System.out.println("this is binary representation"+value);
	}
	

}
