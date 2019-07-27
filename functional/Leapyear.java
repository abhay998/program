package functional;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here Scanner is class to take the value to the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year");
		int Year = scanner.nextInt();
		boolean flag;
		// year year divide by 400 then it is leap
		if(Year % 400==0)
		{
			flag  =  true;
		}
		// year divide by 100 then it is not leap
		else if (Year%100 == 0)
		{
			flag = false;
			
		}
		// year year divide by 4 then it is leap
		else if(Year%4 == 0)
		{
			flag = true;
		}
		else {
			flag = false;
		}
		if(flag)
		{
			// print the result 
			System.out.println("year "+Year+" this is leap year");
		}
		else {
			System.out.println("year "+Year+" this is not a leap year");
		}
			

	}

}
