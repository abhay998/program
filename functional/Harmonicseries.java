package functional;
import java.util.Scanner;

public class Harmonicseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = 0;
		System.out.print("enter a num");
		// Scanner a clas to take the value to the user
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while(num>0)
		{
			// obtain the harmonic series value
			result = result + (double) 1/num;
			num--;
			
		} 
		// print the result
		System.out.println("the harmonic series  "+result+"    is");

	}

}
