package org.tnsif.ThreadDemo;

public class Thread2 extends Thread {
	SyncronizationDemo s= new SyncronizationDemo();
	
	
	
	public Thread2(SyncronizationDemo s) {
		super();
		this.s = s;
	}



	public void run() {
		try {
		s.print(100);
		}
	}
	catch(InterruptedException e) {
		System.out.println(e);
	
	}

}