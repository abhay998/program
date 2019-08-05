package com.bridgelabz.datastructure;
import java.util.Scanner;



public class BalancedParenthesesusingStack {
	
	 static class stack  
	    { 
	        int top=-1; 
	        char items[] = new char[100]; 
	  
	        void push(char x)  
	        { 
	            if (top == 99)  
	            { 
	                System.out.println("Stack full"); 
	            }  
	            else 
	            { 
	                items[++top] = x;
	            } 
	        } 
	  
	        char pop()  
	        { 
	            if (top == -1)  
	            { 
	                System.out.println("Underflow error"); 
	                return '\0'; 
	            }  
	            else 
	            { 
	                char element = items[top]; 
	                top--; 
	                return element; 
	            } 
	        } 
	  
	        boolean isEmpty()  
	        { 
	          if(top == -1) 
	             return true;
	            else
	             return false; 
	        } 
	    } 
	      
	  
	    static boolean isMatchingPattern(char character1, char character2) 
	    { 
	       if (character1 == '(' && character2 == ')') 
	         return true; 
	       else if (character1 == '{' && character2 == '}') 
	         return true; 
	       else if (character1 == '[' && character2 == ']') 
	         return true; 
	       else
	         return false; 
	    } 
	      
	    
	    static boolean areParenthesisEqual(char exp[]) 
	    { 
	     
	       stack st=new stack(); 
	       
	       
	       for(int i=0;i<exp.length;i++) 
	       { 
	            
	          
	          if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') 
	            st.push(exp[i]); 
	       
	         
	          if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') 
	          { 
	             
	             if (st.isEmpty()) 
	               { 
	                   return false; 
	               }  
	       
	             else if ( !isMatchingPattern(st.pop(), exp[i]) ) 
	               { 
	                   return false; 
	               } 
	          } 
	            
	       } 
	          
	     
	        
	       if (st.isEmpty()) 
	         return true; /*balanced*/
	       else
	         {   /*not balanced*/
	             return false; 
	         }  
	    }  
	      
	   
	    public static void main(String[] args)  
	    { 
	        //char exp[] = {'{','(',')','}','[',']'}; 
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("which all parentesis you want add");
	        String s = scanner.next(); 
	    	char ch[] = s.toCharArray(); 
	    	//char ch = s.charAt(0);
	          if (areParenthesisEqual(ch)) 
	            System.out.println("Balanced "); 
	          else
	            System.out.println("Not Balanced ");   
	    } 
	  
	} 

		

