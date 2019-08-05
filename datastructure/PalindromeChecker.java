package com.bridgelabz.datastructure;
import java .util.Scanner;
//static String data;
public class PalindromeChecker {
   
	static char[] queue=new char[1000];
	static int rear;
	static int front;
	static int size;
    
	public void enqueue(char data) {
	   if(!isfull())
	{
	  queue[rear] = data;
	  rear = ((rear+1)%5);
	  size++;
   }
	  else 
		  System.out.println("queue is full");
	  
}
   public void dequeue() {
	   if(!isEmpty()) 
	   {
		
       char data = queue[front];
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
		for(char n :queue) {
			System.out.print(n+"   ");
		}
			
	
	}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner br=new Scanner(System.in);
			String a;
			
			System.out.println("enter string to be for palindrome to be checked");
			a=br.nextLine();
			PalindromeChecker d=new PalindromeChecker();
			int c=a.length();
			for(int i=0;i<=c-1;i++)
			{
		    d.enqueue(a.charAt(i));
			}
			String reverse =" ";
			
			//for(int i=1;i<=c;i++)
			{
			  while(!d.isEmpty())
			 {
				 reverse= reverse + d.dequeue();
			 }
			}
			System.out.println("word after the dequeing from queue::    "+reverse);
			if(a.equals(reverse))
			{
				System.out.println("enter String is palindrome");
				
			}
			else {
				System.out.println("enter String is not palindrome");
			}
			// d.show();
		}
}
		