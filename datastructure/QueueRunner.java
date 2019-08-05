package com.bridgelabz.datastructure;
import java.util.Scanner;

public class QueueRunner {
	/*public static void main(String[] args) {
		BankingCashCounter q = new BankingCashCounter();
			    q.enqueue(4);
		        q.enqueue(45);
		        q.enqueue(144);
		        q.enqueue(7);
		        
		        q.dequeue();
		        q.dequeue();
		        
		        q.enqueue(778);
		        q.enqueue(54);
		        
		        q.enqueue(48);
		        q.enqueue(35);
		        
		       
		        System.out.println(q.isEmpty());
		        System.out.println(q.isfull());
		        System.out.println(q.getSize()+"size");
		        q.show();
		        
		        */
		        
		        public static void main(String args[]) {
		            
		        	 {
		        		Scanner scanner = new Scanner(System.in);
		        		BankingCashCounter q = new BankingCashCounter();
		               // System.out.println("Enter Account Number:");
		                //int acno = scanner.nextInt();
		               System.out.println("Enter Initial Balance:");
		               int  bal = scanner.nextInt();        

		        	    System.out.println("enter a value if you want to deposit money then enter 1 and if you want withdraw money then enter 2");
		        		int n = scanner.nextInt();
		        		switch( n) {
		        		 case 1: 
		        		
		        		 {
		        		        int amount;
		        		        System.out.println("Enter Amount to be Deposited:");
		        		        amount = scanner.nextInt();
		        		        q.enqueue(amount);
		        		        bal = bal+amount;
		        		        
		        		        System.out.println("Deposited! Account Balance is "+bal);
		        		    }
		        		 case 2:{
		        			 {
		        			        int amount;
		        			        System.out.println("Enter Amount to be Withdrawn:");
		        			        amount = scanner.nextInt();
		        			        if(amount<bal)
		        			        {   
		        			        	q.dequeue();
		        			            bal = bal-amount;
		        			            System.out.println("Amount Withdrawn!! Available Balance: "+bal);
		        			        }
		        			        else
		        			        {
		        			            System.out.println("Insufficient funds!!");
		        			            
		        			        }
		        			        q.show();
		        			    	  
		        			 }
		        			 
		        		 }
		        		}
		        	
	}
}
	}
	
