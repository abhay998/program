package com.bridgelabz.datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class HashingRunner {
	public static void main(String[] args) throws FileNotFoundException
	{
		LinkedList<Integer> list1;
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(new File("/home/admin123/Desktop/hashing"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (s.hasNext()) {
			list.add(s.nextInt());
		}
		System.out.println(list);
		
		HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		for (Integer integer : list) {
			System.out.println(integer);
			
			int slotNo = integer%11;
			System.out.println("Slot: "+slotNo);
			
			list1 = map.get(slotNo);
			if( list1 == null )
			{
				//System.out.println("Value is null");
				list1 = new LinkedList<Integer>();
				map.put(slotNo, list1);
			}
			
			//System.out.println("Value is not null");
			list1.add(integer);
		}
		System.out.println(map);
			
		System.out.println("Enter Number you want to search ");
		int num = sc.nextInt();
		int SlotNumber= num%11;
		//map1.get(SlotNumber);
		
		list1 = map.get(SlotNumber);
		System.out.println(list);
		if(list.contains(num))
		{
			System.out.println("Number is present \nshould be delete");
			System.out.println(list1.pop()+" is poped");
		}
		else
		{
			System.out.println(num+" is not present \nshould be push");
			list1.add(num);
		}
		System.out.println(map);
sc.close();
s.close();
}

}


/*
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
public class HashingRunner {

	private static final String[] Node = null;

	public static void main(String args[])
	{
		try {
			
			Scanner sc=new Scanner(System.in);
			LinkedList list = new LinkedList();
				
			FileReader fr=new FileReader("/home/admin123/Desktop/hashing"); 
			
			BufferedReader br=new BufferedReader(fr);   
			
		    String line;
		    String[] data = {};
//		    List<String> wordList = new ArrayList<String>();
		    
		    while((line = br.readLine()) != null){
		    	data= line.split(" ");
		    	for(int i=0; i <data.length; i++)
		    	{
		    		list.append(data[i]);
		    		
		    	}
		    
		    }
		list.show();
		    
		 
		  
	      
	      for (int j = 0; j < 11; j++)
			  System.out.println("Element at index " + j + 
			                                " : ");
		}
	       
	     //  int a = list.index(data[i]) % 11;
	    		   
	
		//int slotnumber=list(data[i])%11; */
	
	catch(IOException e)
	{ 
		System.out.println(e.getMessage());
	}
	}
}

	  	