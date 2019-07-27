package functional;
import java.util.Scanner;


public class Permutation {
	
	  public static void main(String[] args) 
	    { 
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("enter a string value that you want to permute it");
		    String str = scanner.next();
		    int n = str.length();
	     //  String str = "ABC";
	        //int n = str.length(); 
	          Permutation permutation = new Permutation(); 
	          permutation.permute(str, 0, n-1);
		    
		  
	    } 
	  
	  
	    /** 
	     * permutation function 
	     * @param str string to calculate permutation for 
	     * @param l starting index 
	     * @param r end index 
	     */
	    void permute(String str, int l, int r) 
	    { 
	        if (l == r) 
	            System.out.println(str); 
	        else
	        { 
	            for (int i = l; i <= r; i++) 
	            { 
	                str = swap(str,l,i); 
	                permute(str, l+1, r); 
	                str = swap(str,l,i); 
	            } 
	        } 
	    } 
	  
	    /** 
	     * Swap Characters at position 
	     * @param a string value 
	      * @param i position 1 
	     * @param j position 2 
	     * @return swapped string 
	     */
	    public String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        char[] charArray = a.toCharArray(); 
	        temp = charArray[i] ; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    } 
	  
	} 


