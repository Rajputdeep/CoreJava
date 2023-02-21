package org.tnsif.ThreadDemo;

public class ThreadExecuter {

	public static void main(String[] args) {
		SimpleThreadProgram p=new SimpleThreadProgram();
		p.setName("Java Thread");
		
		p.setPriority(1);
		p.run();
		p.run();
		
		
		
		//Once we call start() we can't restart but u can call run()
		p.start();
		System.out.println("Current Thread :"+p);

	}

}