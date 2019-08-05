package com.bridgelabz.datastructure;
import java.util.Scanner;

public class BankingCashCounter {
    int[] queue = new int[5];
	static int rear;
	int front;
	int size;
    
	public void enqueue(int data) {
		   if(!isfull())
		{
		  queue[rear] = data;
		  rear = ((rear+1)%5);
		  size++;
	   }
		  else 
			  System.out.println("queue is full");
		  
	}
	   public void dequeue( ) {
		   if(!isEmpty()) 
		   {
			
		  int data = queue[front];
		   front = ((front+1)%5);
		   size = size-1;
		   }
		   else
			   System.out.println("queue is empty");
	   }
   
  public int getSize()  {
	return size;
	    }
   public boolean isEmpty()
   {
	   return getSize()==0;
   }
   public boolean isfull() {
	   return getSize() ==5;
   }
   
   
	public void show()
	{
		System.out.print("Elements     ");
		for(int i =0;i<size-1;i++) {
			System.out.print(queue[(front+i)%5]+"  ");
		}
		System.out.println("  ");
		for(int n :queue) {
			System.out.print(n+"   ");
		}
			
	
	}
}
	/*
	
	public static void main(String args[]) {
    int size = 1;
    while(size<=5);
	 {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Number:");
        int acno = scanner.nextInt();
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
			            bal = bal-amount;
			            System.out.println("Amount Withdrawn!! Available Balance: "+bal);
			        }
			        else
			        {
			            System.out.println("Insufficient funds!!");
			         
			        }
			        size++;
			    	  
			 }
			 
		 }
		}
	
  
	
	
	}
	}
}
*/
		
			     
	
	
	          
		
	
	

	

