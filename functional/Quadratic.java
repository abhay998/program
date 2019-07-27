package functional;
import java.util.Scanner;
import java.util.*;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double root1,root2;
		// here Scanner class use take the the value the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = scanner.nextInt();
		System.out.println("Enter b value");
		int b = scanner.nextInt();
		System.out.println("Enter c value");
		int c = scanner.nextInt();
		// here the cheak the value that is imaginary or real no
		 double x = b*b-4*a*c;
		 if(0<x) {
			System.out.println("this is real no");
			// caluculate the equation  for real number
			root1 =  (-b + Math.sqrt(x)) / (2 * a);
			root2 =  (+b + Math.sqrt(x)) / (2 * a);
			System.out.println(+root1);
			System.out.println(+root2);
			
		 }
		 
	 else if (x == 0) {
         root1 = root2 = -b / (2 * a);
         System.out.format("root1 = root2 = %.2f;", root1);;
	 }
	 
		 else  {
			 // calculate the equation for imaginary number
			 System.out.println("this is imaginary number");
			 double realPart = -b / (2 *a);
	            double imaginaryPart = Math.sqrt(-x) / (2 * a);
	            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart,realPart,imaginaryPart);
	        }
	    }
	            
}


