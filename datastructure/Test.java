package com.bridgelabz.datastructure;

public class Test {
//Driver class 

public static void main(String[] args) 
{ 
    Queue q = new Queue(); 
    q.enqueue(10); 
    q.enqueue(20); 
    q.dequeue(); 
    q.dequeue(); 
    q.enqueue(30); 
    q.enqueue(40); 
    q.enqueue(50); 

    System.out.println("Dequeued item is " + q.dequeue().key); 
} 
} 
