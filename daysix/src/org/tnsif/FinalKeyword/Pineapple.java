package org.tnsif.FinalKeyword;

public class Pineapple extends Cake {
	
	private int price;
	
	//void display()
	/*{
		System.out.println();
	}  */
	final void display(int price)
	{
		System.out.println("The price is :"+price);
	}
    //Getters & seters
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}