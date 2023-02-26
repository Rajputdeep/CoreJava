package org.tnsif.queuedemo;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<String>obj=new ArrayDeque<>();
		obj.add("Vaibhav");
		obj.addFirst("Deepal");
		obj.addLast("Pratik");
		System.out.println("Array Deque elements are :"+obj);
		obj.remove();
		System.out.println("Array Deque elements are :"+obj);
		obj.removeFirst();
		System.out.println("Array Deque elements are :"+obj);
		obj.removeLast();
		System.out.println("Array Deque elements are :"+obj);
		

	}

}
