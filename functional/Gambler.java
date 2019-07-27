package functional;
import java.util.Random;
import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int match;
   int win,loss;
   int counter;
   counter = 0;
   win= 0;
   loss = 0;
   {
	   // here Scanner is a class to take the value to user
	   Scanner scanner = new Scanner(System.in);
	   // enter a money to give stack amount 
	   System.out.println("enter your money");
	   int stack = scanner.nextInt();
	  // enter amoney to target your goal amount 
	   System.out.println("enter your goal");
	   int goal = scanner.nextInt();
	   // how many times you want to play
	   System.out.println("enter how many times you want play");
	   int numberoftimesplay = scanner.nextInt();
	  // here Random class is use to take the value randomly 
	   Random matchplay = new Random();
	   int random = matchplay.nextInt(1);
	   int cash = stack;
	   while(counter < numberoftimesplay) {
		   // if randome valueis less the 0.5 then print the win amount
		   if (random < 0.5)
		   {
			   win+=1;
			   System.out.println("win is "+win+"  win ");
			   cash++;
					   
			   
		   } 
		   
		    else{
		    	// if randome valueis greater the 0.5 then print the loss amount
		    	
		    	loss+=1;
		    	System.out.println("loss is "+loss+" loss");
		    	cash--;
		   }
		   counter++;
		   random = matchplay.nextInt(2);
		   // if your amount reach at your goal amount 
		   if(cash==goal) {
			   break;
		   }
	    }
	   // print the amount
	 	   System.out.println("this is  cash   "+cash+"   rupess");
         }
	     
	    	
	    }  

	}

 




  
  


