package org.tnsif.ThreadDemo;

public class Thread1 extends Thread {
	SyncronizationDemo s= new SyncronizationDemo();
	
	
	
	public Thread1(SyncronizationDemo s) {
		super();
		this.s = s;
	}



	public void run() {
		try
		{
			d.print(15);
		}catch (InteruptedException e) {
			System.out.println(e);
		}
		
	}

}
