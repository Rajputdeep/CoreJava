package org.tnsif.abstraction;

public abstract class Menu {
	
	//abstract method
	
	abstract void recipe();
	abstract void foodType();
	
	//concrete method means non abstract method
	void menuType() {
		System.out.println("Veg and NonVeg");
	}
}