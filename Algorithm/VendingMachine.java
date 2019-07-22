package Algorithm;
import java.util.Scanner;

public class VendingMachine {

	 int amount,i,calculate;
	 static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
	
	public  void claculate(int amount) {
		 if(amount>=1) {
			  for(i=0;i<notes.length;i++) 
				calculate = amount/notes[i];
			    calculate = calculate+1;
			  }
			  
		else {
				  System.out.println("enter a write amount");
			  
	 }
	}
	
	 public static void main() {
		
		 
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter a amount");
		 int amount = scanner.nextInt();
		 
		 System.out.println("");
		 
	 }
	}


