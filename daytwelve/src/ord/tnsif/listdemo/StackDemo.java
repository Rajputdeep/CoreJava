package ord.tnsif.listdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		obj.push("Deepal");
		obj.push("pratik");
		obj.push("Krishna");
		obj.push("Sahil");
		System.out.println("the element inside the stack are:"+"are:"+obj);
		obj.pop();
		System.out.println("the element inside the stack are:"+"are:"+obj);
	}

}