package functional;
import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,flag=0;
        int num;
        // take the value 1 to 1000
        if(num%2==0)	
        
        for(i=1;i<=1000;i++)
        {
        	for(int j = 2; j < i; j++)
            {
        		
                if(i % j == 0) {
                	flag=0;
                	break;
                }
                	else
                	{
                      flag = 1;
                	}
                }
        	// if flag value 1 obtaind then it is prime number
        	if(flag==1) {
        		System.out.println(i);
            }
        }
	}
}
       