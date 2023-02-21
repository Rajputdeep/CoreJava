package org.tnsif.interfacedemo;

public class InterfaceExecuter {
	
	public static void main(String[] args) {
		//we can't instantiate interface
		//Bike b=new Bike();
		
		Avenger a=new Avenger();
		a.engine();
		a.milege(45);
	}

}
