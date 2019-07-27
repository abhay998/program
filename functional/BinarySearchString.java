package functional;
import java.util.Scanner;

class BinarySearchString{ 
	
    static int binarySearch(String[] arr, String x) 
    { 
    	// here l is left and r is right
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
        	// here m is mid and find the mid value
            int m = l + (r - l) / 2; 
            // here x value is comapre to mid value
            // x value what you want to search
            int res = x.compareTo(arr[m]); 
  
           
            if (res == 0) 
                return m; 
  
           
            if (res > 0) 
                l = m + 1; 
  
            
            else
                r = m - 1; 
        } 
  
        return -1; 
    } 
  
 
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
	       int result = binarySearch(store,x); 
            if (result == -1) 
        	// print the result
               System.out.println("Element not present"); 
           else
               System.out.println("Element found at "
                              + "index " + result); 
    } 
} 




