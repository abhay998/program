package functional;
import java.util.Scanner;

class InsertionSort { 
    
   static int[] sort(int arr[]) {
    
	   //here n is find the length of the array
	   int n = arr.length; 
       for (int i = 1; i < n; ++i) { 
           int key = arr[i]; 
           int j = i - 1; 
 
           /* Move elements of arr[0..i-1], that are 
              greater than key, to one position ahead 
              of their current position */
           while (j >= 0 && arr[j] > key) { 
               arr[j+1] = arr[j]; 
               j = j - 1; 
           } 
           arr[j + 1] = key; 
       } 
       return arr;
   }   
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
        int sortedarray[] = sort(store);
        System.out.println("Strings in sorted order are : "); 
        // after sorting the array
        for (int i = 1; i < n; i++) 
            System.out.println(sortedarray[i]); 
    } 
} 	
	
	
