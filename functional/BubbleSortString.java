package functional;
import java.util.Scanner;


public class BubbleSortString {
	// here n is find the array length 
  static String[] sort(String[] arr,int n) {
    	 String temp;
    	 int i,j;
    	// here i value search the last-1 position
    	  for (i = 0; i < n -1; i++) 
          { 
              for ( j = i+1; j < n; j++)  
              { 
                  if (arr[i].compareTo(arr[j]) > 0) 
                  { 
                	// temp is variable
                      temp = arr[i]; 
                      arr[i] = arr[j]; 
                      arr[j] = temp;
                  }
	
          }
}        return arr;
     }
     //nt n = arr.length;
    	 //sort(arr,n);
    	 //System.out.println("Strings in sorted order are : "); 
        // for (int i = 0; i < n; i++) 
        	 // after sort the array and then print
       // public static void main(String args[]) {
    	// BubbleSortString obj = new BubbleSortString();
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
     
   	      
