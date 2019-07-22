package Algorithm;

import java.util.Scanner;

public class InsertionSortInteger {
	 public static void main(String args[]) 
	    {
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("enter how many number you want to store");
		  int n = scanner.nextInt();
		  int store[] = new int[n];
		  System.out.println("enter element you want to store");
		  for(int i=1;i<n;i++) {
			  store[i] = scanner.nextInt();
		  }
		 
	      //  int arr[] = { 12, 11, 13, 5, 6 }; 
	       // int n= arr.length;
	       // InsertionSort ob = new InsertionSort(); 
	        int sortedarray[] = Util.insertionsort(store);
	        System.out.println("Strings in sorted order are : "); 
	        // after sorting the array
	        for (int i = 1; i < n; i++) 
	            System.out.println(sortedarray[i]); 
	    } 
	} 	


