package functional;
import java.util.Scanner;


class BinarySearchInteger { 

	static  int binarySearch(int arr[], int x) 
    { 
    	// here l is left and r is right
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
        	// here m is mid and find the mid value
            int m =(int) l + (r - l) / 2; 
  
            
            if (arr[m] == x) 
                return m; 
  
            // if x value is greater than mid value
            if (arr[m] < x) 
                l = m + 1; 
  
          
            else
             // if x value is less than mid value
                r = m - 1; 
        } 
  
      
        return -1; 
    } 
	  
	  
	     
	    public static void main(String args[]) 
	    { 
	       //BinarySearchInteger ob = new BinarySearchInteger(); 
	        // here given the array
	       System.out.println("how many number you want to store");
	       Scanner scanner = new Scanner(System.in);
	       int n = scanner.nextInt();
	       int store[] = new int[n];
	       System.out.println("which all  element you want to store");
	       for(int i =0;i<n;i++)
	       {
	    	  store[i] = scanner.nextInt();
	       }
	       
	     //   int arr[] = { 2, 3, 4, 10, 40 }; 
	      //  int n = arr.length; 
	       // int x = 10; 
	       System.out.println("enter a element you want to search");
	       int x = scanner.nextInt();
	       int result = binarySearch(store,x); 
	        if (result == -1) 
	        	//print the result
	            System.out.println("Element not present"); 
	        else
	            System.out.println("Element found at "
	                               + "index " + result); 
	    } 
	} 


