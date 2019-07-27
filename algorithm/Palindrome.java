package algorithm;

public class Palindrome {
	void checkPalindrome(int num){

		  int i,j,sum=0,rev=0,temp,rem=0;
		  temp=num;

		  
		  if(num>9)
		  {
		    while(temp>0)
		    {
		      rem=temp%10;
		      rev = rev*10+rem;
		      temp=temp/10;
		    }
		  
		    if(rev == num)
		    {
		      System.out.print(" is a palindrome");
		    }
		  }
		  

		  }

}
