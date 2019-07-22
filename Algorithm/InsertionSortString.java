package Algorithm;

import java.util.Scanner;

public class InsertionSortString {
	
	  {
	    	 Scanner scanner = new Scanner(System.in);
	    	 System.out.println("enter a strinng you want to store");
	    	 int n = scanner.nextInt();
	    	 String store[] = new String[n];
	    	 System.out.println("enter element you want to store");
	   	      for(int i=0;i<n;i++)
	   	      {
	   		  store[i] = scanner.next();
	   	      }
	    	 
	    	 //String[] arr = {"pratap","abhay","singh","jai"};
	    	// i     System.out.println("String " + (i + 1) + " is " + arr[i]); 
	   		 String[] sortedarray = Util.insertionsort(store,n);
	         System.out.println("Strings in sorted order are : "); 
	         // after sorting the array
	         for (int i = 0; i < n; i++) 
	             System.out.println(sortedarray[i]); 
	     
	     }
	}


