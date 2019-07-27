package algorithm;

import java.util.Scanner;

public class MergeSort { // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    static int[] merge(int arr[],int m) 
    { 
    	int l =0,r= arr.length-1;
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        }
    return arr;
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    public static void main(String args[]) {
   	 // BubbleSortInteger obj = new BubbleSortInteger();
   	  // here given the array
   	  Scanner scanner = new Scanner(System.in);
   	  System.out.println("how many number you want store");
   	  int m = scanner.nextInt();
   	  int store[] = new int[m];
   	  System.out.println("which all element number you want to store");
   	  	//  int arr[] = {2,1,5,3,9,4};
   	//  int n = arr.length;
   	 // obj.sort(arr);
   	  
   	  for(int i=0;i<m;i++) {
   		  store[i] = scanner.nextInt();
   	  }
   	  int sorted[] = merge(store,m);
   	  System.out.println("Strings in sorted order are : "); 
         for (int i = 0; i < m; i++) 
       	  // after sort the array and then print
             System.out.println("String " + (i + 1) + " is " + store[i]); 
   	  
     }
   	
   }