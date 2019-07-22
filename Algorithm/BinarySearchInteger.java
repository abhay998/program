package Algorithm;

import java.util.Scanner;

public class BinarySearchInteger {

	  
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
       int result = Util.binarySearch(store,x); 
        if (result == -1) 
        	//print the result
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                               + "index " + result); 
    } 
} 