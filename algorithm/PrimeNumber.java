package algorithm;
import java.util.*;
import java.lang.*;

public class PrimeNumber {
	 
	  static int[] genPrime(int l,int r)
	  {
	    int flag=0,i,j;
	    int primeArr[]=new int[500];
	    int count=0;
	    

	    System.out.println("Prime Numbers Between "+l+" and "+r+":");
	    for(i=l;i<=r;i++)
	    {
	      for(j=2;j < i; j++)
	      {
	        flag=0;
	        if( i % j == 0 )
	          {
	            flag=1;
	            break;
	          }
	      }
	      if(flag ==0 )
	        {
	          if(i==0 || i==1)
	          {

	          }
	          else{
	        //	 int arr[] = new int[i];
	            System.out.print(i+"\t");
	            primeArr[count]=i;
	            count++;
	        }
	        }

	    }
	    
	    return primeArr;
	  }

      public static void main(String args[])
	  {
	    int min,max;
	    System.out.println("Enter the Min and Max range");

	    Scanner s = new Scanner(System.in);
	    int l=s.nextInt();
	    int r=s.nextInt();

	    int prime[]=genPrime(l,r);
	    int[] num=new int[2];
	    	    
	    AnagramInteger.checkAnagram(prime);
	   
	    
	   

	  }
	
	}


