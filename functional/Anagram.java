package functional;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here given the value of first string and second array
		String first,second;
		// make a class to take input to user
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first string    ");
		first = scanner.nextLine();
		//here string value store in charater for in new array
		
		char sortfirst[] = first.toCharArray();
		// here find the length of the string value
		int n = sortfirst.length;
		// use the bubble sort for sort the string value
		for (int i = 0; i < n -1; i++) 
        { 
            for (int j = 0; j < n-i-1; j++)  
            { 
                if (sortfirst[j]>sortfirst[j+1]) 
		{
		char temp = sortfirst[j];
		sortfirst[j] = sortfirst[j+1];
		sortfirst[j+1] = temp;
		
		}
		}
		}
		System.out.println("enter second string");
		second = scanner.nextLine();
		char sortsecond[] = second.toCharArray();
		// here find the length of the string value
		 int m = sortsecond.length;
		// use the bubble sort for sort the string value
		for (int i = 0; i < m -1; i++) 
        { 
            for (int j = 0; j < m-i-1; j++)  
            { 
                if (sortfirst[j]>sortfirst[j+1]) 
		{
		char temp = sortsecond[j];
		sortsecond[j] = sortsecond[j+1];
		sortsecond[j+1] = temp;
		
		}
           
		}
        }
	
		//prit result after sort
		System.out.println("In sorted Order First: " + new String(sortfirst));
		System.out.println("In sorted Order Second: " +new String(sortsecond));
		 // give boolean output if anagram or not
	//	System.out.println(new String(sortfirst).equals(new String(sortsecond)));//true 

	
/* if(new String(sortfirst).equals(new String(sortsecond)))
    {
     System.out.println(first+" and "+second+" are Anagrams");
    }
    else
    {
      System.out.println(first+" and "+second+" are not Anagrams");
    }

}
} */
	
	}
}



	