package algorithm;

import java.util.*;
import java.lang.*;
import java.io.*;

 public class GuessNumber{
	
	public static void guessNumber(int N) {
		String Replyyes= "yes";
		String Replyno = "no";
		Scanner sc=new Scanner(System.in);
		String answer=new String();
		int l = 0 , r =N-1;
		do
			{
			
			int m  = l + (r-l)/2;
			System.out.println("your guess number is :"+m);
			answer = sc.next(); 
			if(answer.compareTo(Replyno)==0)
			{
				System.out.println("is your guess number greater than "+m);
				String ans = sc.next();
				if(ans.compareTo(Replyyes)==0)
					l=m+1;
				else
					r=m-1;
			}
			}while (answer.compareTo(Replyyes)!=0);
		
		

	}

	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		guessNumber(n);
	}
}
  
