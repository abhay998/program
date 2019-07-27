package functional;
import java.lang.Math;
import java.io.*;
import java.util.Scanner;


public class Factors {

	public static void primeFactors(int n) {
		// TODO Auto-generated method stub
		
	while(n%2==0) {
		System.out.print(2 +" ");
		n/=2;
		}
	for(int i=3; i<=Math.sqrt(n); i+= 2) 
	{
		while(n%i==0)
		{
			System.out.print(i +" ");
			n/=i;
		}
		
	}
	if(n>2)
		System.out.print(n);

	}
	public static void main(String args[]) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scanner.nextInt();
		primeFactors(n);
		
	//	int n = 1092;
    //		primeFactors(n);
				
	}
	

}
