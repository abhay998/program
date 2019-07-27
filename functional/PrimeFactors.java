package functional;
import java.util.Scanner;

public class PrimeFactors {
	


		/**
		 * Finction to check if the no is prime or not
		 * 
		 * @param n the number to check for prime
		 * @return true if prime and vice-versa
		 */
		public static void isPrime(int n) {
			int temp=n;
			for (int i = 2; i*i <= temp; i++) {
				while(n % i == 0) {
				System.out.print(i+"  ");
				n/=i;
				
				}
				
			 }	
			
		}
		

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter no to find prime factors");
			int n = s.nextInt();
			System.out.println("prime factors are ");
			isPrime(n);
		//	System.out.println();
	

		}
	}


