package Algorithm;

import java.util.Scanner;

public class BinarySearchString {
	public static void main(String []args) 
    { 
    	   // here given the array
	       System.out.println("how many number you want to store");
	       Scanner scanner = new Scanner(System.in);
	       int n = scanner.nextInt();
	       String store[] = new String[n];
	       System.out.println("which all  element you want to store");
	       for(int i =0;i<n-1;i++)
	       {
	    	  store[i] = scanner.next();
	       }
	       
	     //   int arr[] = { 2, 3, 4, 10, 40 }; 
	      //  int n = arr.length; 
	       // int x = 10; 
	       System.out.println("enter a element you want to search");
	       String x = scanner.next();
	       int result = Util.binarySearch(store,x); 
            if (result == -1) 
        	// print the result
               System.out.println("Element not present"); 
           else
               System.out.println("Element found at "
                              + "index " + result); 
    } 
} 




