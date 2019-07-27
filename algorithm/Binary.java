package algorithm;

import java.util.Scanner;

public class Binary {
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
	

	
	public static void swap(String value) {
		
		char[] sa=value.toLowerCase().toCharArray();
		int n = sa.length;
		//for(int i =0;i<n;i++)
		/*
		 * 
		 * int n = value.length();
		Scanner scanner = new Scanner(System.in);
		//System.out.println("enter number");
		int[] arr = new int[];
		for(int i = 0;i<n;i++)
			arr[i] = scanner.hasNext()
		*/
		int j = n-4;
		for(int i=0;i<4;i--) 
		//for(int j=i+1;j<i;j++)
		{
			
			char temp = sa[i];
			sa[i] = sa[j];
			sa[j] =  temp;
			
		}
		String jai = String.valueOf(sa);
		System.out.println(jai);                                                           
	}
	
	
}


