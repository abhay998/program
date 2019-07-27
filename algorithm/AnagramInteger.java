package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramInteger {
	
 static	int[] checkAnagram(int arr[])
	{
	  int i,j,count=0;
	  int anagram[]=new int[250];
	  System.out.println("Anagram are as Follows");
	  for(i=0;i<arr.length-1;i++)
	  {
		  if(arr[i]>0) {
		  for(j=i+1;j<arr.length;j++)
		  {
			  boolean isAnagram=true;
			  int firstCount[]=new int[10];int secondCount[]=new int[10];
			  
			  int firstNum=arr[i];int sceondNum=arr[j];
			  
			  int firstlength=0;int sceondlength=0;
			  for(int k=0;k<10;k++)
			  {
				  firstCount[k]=0;
				  secondCount[k]=0;
			  }
			  while(firstNum>0)
			  {
//				  System.out.println(firstNum);
				  int digit=firstNum%10;
				  firstCount[digit]++;
				  firstlength++;
				  firstNum/=10;
			  }
			  while(sceondNum>0)
			  {
//				  System.out.println("Anagram are as Follows");
				  int digit=sceondNum%10;
				  secondCount[digit]++;
				  sceondlength++;
				  sceondNum/=10;
			  }
			  if(firstlength==sceondlength)
			  {
//				  System.out.println("Same Length");
				for(int k=0;k<10;k++)
				{
					if(firstCount[k]!=secondCount[k])
					{
						isAnagram=false;
						break;
					}
				}
				if(isAnagram)
				{
					anagram[count]=arr[i];
					count++;
					anagram[count]=arr[j];
					count++;
					System.out.println(arr[i]+" and "+arr[j]+"are Angram");
				}
			  }
		  }  		  
		  }
	  }
	  return anagram;
//	  int brr[] = new int[len],flag = 0;
//	  for(int i=0;i<len;i++)
//	    {
//	      str = String.valueOf(arr[i]);
//	      char c[] = str.toCharArray();
//	      Arrays.sort(c);
//	      str1 = String.valueOf(c);
//	      int val = Integer.parseInt(str1);
//	      brr[i] = val;
//
//	    }
//	    System.out.println("\nThe Anagrams are");
//	  for(int i=0;i<len;i++)
//	  {
//	    for(int j=i+1;j<len;j++)
//	    {
//	      if(brr[i]==brr[j])
//	      {
//	        System.out.println(arr[i]+"---"+arr[j]);
//	        flag = 1;
//	      }
//	    }
//	  }
//	  if(flag==0)
//	  {
//	    System.out.println(" None");
//	  }
	}
}

	  /*  public static void main(String[] args) 
	   {
		//Anagram a= new Anagram();
		Scanner sc=new Scanner(System.in);
		//taking user input
		System.out.println("Enter two string");
		 int len=sc.nextInt();
		//System.out.println("\n");
		//int s12=sc.nextInt();
		//calling anagram function
		checkAnagram(arr,len);
	  }
	  }

}  */
