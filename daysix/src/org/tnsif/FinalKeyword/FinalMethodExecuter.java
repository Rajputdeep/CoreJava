package org.tnsif.FinalKeyword;

public class FinalMethodExecuter {

	public static void main(String[] args) {
		Pineapple p=new Pineapple();
		p.flavour="MixedFruit";
		p.display();
		p.setPrice(250);
		p.display(p.getPrice());

	}

}
