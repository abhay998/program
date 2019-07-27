package functional;
import java.util.*;
class WindChill
{
	public static void main(String args[])
	{ 
		// take the value to the command line arguments
		double temp = Double.parseDouble(args[0]);
		double velocity = Double.parseDouble(args[1]);
		double w=0;
       // here check the condition
		if(temp > 50 || velocity>120 || velocity <3 )
		{
			System.out.println("Invalid Input!\n temperature should < 50 and Velocity between 3 and 120");
		}		
		else
		{ 
			// calculate the value 
			w = 35.74 + 0.62151*temp + ( 0.4275 * temp - 35.75) * (Math.pow(velocity,0.16));
			// print the result
			System.out.println("WindChill:"+ w);
		}
		

	}


}