package functional;

import java.util.Scanner;

public class VendingMachine {

	
   static  int i=0;
   static int total = 0;
   static int[] notes = new int[]{1000,500,100,50,20,10,5,2,1};
   public static void main(String args[]) {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter a amount");
    int amount = obj.nextInt();
	VendingMachine(amount);
   }
public static void VendingMachine(int amount) {
		if(amount/notes[i]!=0) {
			
			total = total + amount/notes[i];
			System.out.println(notes[i]+"/-Rs Notes :"+amount/notes[i]);
			amount = amount%notes[i];
			}
		   i++;
		    if(amount==0)
			    System.out.println("total notes is   "+total);
		 else
			 VendingMachine(amount);
		 
	
	}
	}


	

