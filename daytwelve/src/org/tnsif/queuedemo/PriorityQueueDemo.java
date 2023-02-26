package org.tnsif.queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer>obj=new PriorityQueue<>();
		obj.offer(13);
		obj.add(22);
		obj.offer(91);
		obj.add(5);
		obj.add(97);
		obj.add(15);
		System.out.println("Queue elements are :"+obj);
		

	}

}