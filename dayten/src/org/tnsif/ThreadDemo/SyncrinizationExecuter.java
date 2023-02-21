package org.tnsif.ThreadDemo;

public class SyncrinizationExecuter {

	public static void main(String[] args) {
		SyncronizationDemo obj = new SyncronizationDemo();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		
		t1.start();
		t2.start();
		
		
	}

}
