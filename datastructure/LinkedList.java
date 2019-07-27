package datastructure;

public class LinkedList 
{
 public Node head;
 
 public  Node list()
	
	{

		Node node = new Node();
	    node.data = "";
	    node.next = null;
	    return node;
	}
 
 
 
 public boolean isEmpty() {
	 if(head==null)
		 return true;
	 else
		 return false;
				 
 }
 // Checks whether the value x is present 
 // in linked list 
// public boolean search(Node head,String item) 
// { 
//     // Base case 
//     if (head == null) 
//         return false; 
//
//     // If key is present in current node, 
//     // return true 
//     if (head.data == item) 
//         return true; 
//
//     // Recur for remaining list 
//     return search(head.next, item); 
// } 
// 
 
 public boolean search(String item) 
{ 
   // Base case 
   if (head == null) 
       return false; 
   Node temp=head;
   while(temp!=null)
   {
	   if(temp.data.compareTo(item)==0)
		   return true;
	   temp=temp.next;
				   
   }
   
      return false; 
} 
	public void append(String data) {
		
		Node node = new Node();
	    node.data = data;
	    node.next = null;
	    
	    if(head==null)
	    {
	    	head = node;
	    }
	    else {
	    	Node n = head;
	    	while(n.next!=null)
	    	{
	    		n = n.next;
	    	}
	    	n.next = node;
	    	
	    	
	    	
	    	
	    }
	}
	
	public void insert( int pos,String data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(pos==0)
		{
			insert(pos, data);
		}
		else {
		Node n = head;
		for(int i=0;i<pos-1;i++)
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}
	}
	
	public int index(String item)
	{
		Node temp=head;
		if(head!=null)
		{
			int position=0;
			while(temp!=null)
			{
				position++;
				if(temp.data.compareTo(item)==0)
				{
					break;
				}
				temp=temp.next;
			}
			return position;
		}
		else
			return -1;
	}
	
	
/*	public String pop(int pos)
	{

		
		Node previousNode = head;
		int count = 1;
		while(count!=pos-1) {
			count++;
			previousNode = previousNode.next;
			
		}
		Node currentNode = previousNode.next;
		previousNode.next= currentNode.next;
		String data = currentNode.data;
		currentNode.next=null;
		return data;
		
	}
	*/
	
 public String pop(int pos)
	{
	  if(pos==1)
	  {
			Node temp;
		    temp= head.next;
		    head =temp.next;
		
		head = head.next;
	    }
	else
		{   int count = 1;
	        Node ptr = head;
			while(ptr!=null && count<pos-1) 
	        {
	         count++;
	         ptr = ptr.next;
	        	
	        }
		  Node temp;
		  temp = ptr.next;
		  String data = ptr.data;
		  ptr.next = temp.next;
	      ptr.next= null;
	      
		}
	  return data;
	}
	
	
	public void show() {
		Node node = head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}



	/*public boolean search(String searchString) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
*/
