package functional;
import java.util.*;

public class Twodarray {

	public static void main(String[] args) {
		int m,n,p,q,c,d,k,sum=0;
		// TODO Auto-generated method stub
		// Scanner is class to take the value to the user
		Scanner num = new Scanner(System.in);
		// enter how many row and colum you want to print
		System.out.println("enter column and row for first array");
		m = num.nextInt();
		n = num.nextInt();
		int first[] [] = new int[m][n];
		// given the first array value
	    System.out.println("enter a element for first array");
		for(c=0;c<m;c++)
			for(d=0;d<n;d++)
				first[c][d] = num.nextInt();
		// given the column and row for seocnd array
	    System.out.println("enter column and row for second array");
		p = num.nextInt();
		q = num.nextInt();
		if(n != p) 
			System.out.println("array can't multiply by each other");
	
		else {
			
		
			int second[][]= new int[p][q];
		    int multiply[][]= new int[m][q];
		    // enter a value for the second array
			System.out.println("enter a element for second array");
			
	            for (c = 0; c < p; c++)
	             
	               for (d = 0; d < q; d++)
	            	second[c][d] = num.nextInt();
	               
	               for (c = 0; c < m; c++)
	               {
	                  for (d = 0; d < q; d++)
	                  {  
	                     for (k = 0; k < p; k++)
	                     {
	               // here multiply the value 
	                  sum = sum + first[c][k]*second[k][d];
	               }
	             // store the vlaue
	               multiply[c][d] = sum;
	               sum = 0;
	            }
	         }
	 
	         System.out.println("Product of the matrices:");
	    // print the result
	         for (c = 0; c < m; c++)
	         {
	            for (d = 0; d < q; d++)
	               System.out.print(multiply[c][d]+"\t");
	 
	            System.out.print("\n");
	         }
	      }
	   }
			
}

	


	
	
	
        
        


	


