package org.tnsif.threadlifecycle;

public class Sender {

	public static void sendMessage(String message) {
		System.out.println("\n Sending"+ message);
		
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Thread Interrupted");
		}

	}

}