package org.tnsif.usingrunnable;

//interface Runnable{
//	void run();
//	void print();
//}
//Program to demonstrate runnable
public class Marathon implements Runnable {
	private int speed;
	private String city;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Speed of participant : "+speed+"The city is :"+city);
		
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	

}
