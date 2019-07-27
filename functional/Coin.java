package functional;
import java.util.Random;
import java.util.Scanner;


public class Coin {

	public static void main(String[] args) {
		int toss;
		int head,tail;
		int counter;
	    head = 0;
		tail = 0;
		counter = 0;
		{
			// make a class to take a input to user
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter a toss how many timesyouwant print");
			toss = scanner.nextInt();
		     // here randome class compute the value randomley
			Random coinToss = new Random();
	        int random = coinToss.nextInt(1);	
	        // here counter value is less then toss value
	        while(counter<toss) {
	        	 // if random value is less then 0.5 then calculate heads
	        	if(random<0.5) {
	        		head+= 1;
	        		System.out.println("this is "+head+"  head toss");
	  
	         }
	        	else {
	        		
	        		 // if random value greater then 0.5 then calculate tails
	        		tail+=1;
	        		
	        	    System.out.println("this is   "+tail+"   tail toss");
	                
	        	}
	        	
	              counter++;
	              random = coinToss.nextInt(2);
	        
					
			
		} 
	      
	        int b = head;
	        //calculate the first percentage of heads
    		int firstper = (b*100)/toss; 
		    System.out.println("this is "+firstper+" %of heads");
		    //calculate the second percentage of tails
		    int secondper = 100 - firstper;
		    System.out.println("this is "+secondper+" %of tail");
	}
 }

}
