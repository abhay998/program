package functional;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeAnagramPalindrome {
	 
	  static void genPrime(int l,int r)
	  {
	    int flag=0,i,j;

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
	            int arr[] = new int[i];
	            System.out.println(i+"\t");
	        }
	        }

	    }
	  }


	    public static void  isPalindrome()
	    
	   {   
	    	//removing all whitespace f
		// String s2=s.replaceAll("\\s", "");
		 //String s3=s.replaceAll("\\s", "");
		 
		 //Initially setting status as true
	    	public static void primePallindrome() {
	    		System.out.println();
	    		boolean b;
	    		for (int j = 2; j <= 1000; j++) {
	    			b = true;
	    			for (int i = 2; i < j / 2; i++) {
	    				if (j % i == 0) {
	    					b = false;
	    					break;
	    				}
	    			}
	    			if (b && isPallindrome(j))
	    				System.out.print(j + " ");
	    		}
	    	}
			   
			   
		 
		 // checking string are same or not
		if(same)
		{
			 System.out.println(s1+" and "+s2+" are anagrams");
			
		}
		else{
			 System.out.println(s1+" and "+s2+" are  not anagrams");
		}
			
	  }
	    public static void main(String[] args) 
	   {
		//Anagram a= new Anagram();
		Scanner sc=new Scanner(System.in);
		//taking user input
		System.out.println("Enter two string");
		String s11=sc.nextLine();
		System.out.println("\n");
		String s12=sc.nextLine();
		//calling anagram function
		isAnagram(s11, s12);
	  }
	    
	    
	    
	  }
	  
	  

