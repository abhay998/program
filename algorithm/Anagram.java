package algorithm;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
    public static void  isAnagram(String s1,String s2)
    
   {   
    	//removing all whitespace f
	// String s2=s.replaceAll("\\s", "");
	 //String s3=s.replaceAll("\\s", "");
	 
	 //Initially setting status as true
	 boolean same=true;
	 if(s1.length()!=s2.length())
	 { //
		//setting status as false if s2 an s3 not have same length
		 same=false;
	 }
	 else
	 {   //converting all uparcase latter to lowercase
		 char[] sa=s1.toLowerCase().toCharArray();
		 char[] sb=s2.toLowerCase().toCharArray();
	//sorting
	 Arrays.sort(sa);
	 Arrays.sort(sb);
	 //Checking whether sa and s2Array are equal
	 
     same = Arrays.equals(sa, sb);
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