package functional;
import java.util.Scanner;

public class poweroftwo {

	public static void main(String a[]) {
		// TODO Auto-generated method stub
	        int base = 2, exponent = 32;
	        // here take the value the command line arguments
	        int numberofpower = Integer.parseInt(a[0]);
		   
	        for(int i = 0; i<exponent;i++)
	        {   
	        	// here math fuction to calculate the value
	        	double result = Math.pow(base, i);
	          
		      if(i==numberofpower) {
	        	  break;
	            }
		      // after the power print the result  
	 
	               System.out.println("Answer = "+i+" is"+ result);
		
}
}
}
