package org.tnsif.threadlifecycle;

public class Tech extends Thread {
	
	public void run()
	{
		System.out.println("Java full stsck training");
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+" ");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

}