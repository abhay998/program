package Algorithm;

import java.util.Scanner;

public class BubbleSortInteger {
	public static void main(String args[]) {
		 // BubbleSortInteger obj = new BubbleSortInteger();
		  // here given the array
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("how many number you want store");
		  int n = scanner.nextInt();
		  int store[] = new int[n];
		  System.out.println("which all element number you want to store");
		  	//  int arr[] = {2,1,5,3,9,4};
		//  int n = arr.length;
		 // obj.sort(arr);
		  
		  for(int i=0;i<n;i++) {
			  store[i] = scanner.nextInt();
		  }
		  int sorted[] = Util.sort(store);
		  System.out.println("Strings in sorted order are : "); 
	      for (int i = 0; i < n; i++) 
	    	  // after sort the array and then print
	          System.out.println("String " + (i + 1) + " is " + store[i]); 
		  
	  }
		
	}


