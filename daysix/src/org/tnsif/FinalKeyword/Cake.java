package org.tnsif.FinalKeyword;

public class Cake {
	protected String flavour;
	
	final void display()
	{
		System.out.println("Flavour of cake is :"+flavour);
	}
    //Getters & setters
	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	

}
