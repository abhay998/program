package functional;

import java.util.Scanner;

public class InsertionSortString {

   static String[] sort(String[] arr,int n) {
		// TODO Auto-generated method stub
	// heren is find the length of the array
      // int n = arr.length; 
       for (int i = 1; i < n; ++i) {
           String key = arr[i]; 
           int j = i - 1; 

           /* Move elements of arr[0..i-1], that are  
           greater than key, to one position ahead  
           of their current position */  
           
           while (j >= 0 && arr[j].compareTo(key)>0) { 
        	   // if (arr[j].compareTo(arr[j+1]) > 0) 
               arr[j + 1] = arr[j]; 
               j = j - 1; 
           } 
           arr[j + 1] = key; 
       } 
       return arr;
   } 

	

  	// here given the array
public static void main(String args[]) 
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
 	 String[] sortedarray = sort(store,n);
       System.out.println("Strings in sorted order are : "); 
       // after sorting the array
       for (int i = 0; i < n; i++) 
           System.out.println(sortedarray[i]); 
   
   }
}
