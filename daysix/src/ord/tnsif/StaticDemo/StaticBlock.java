package ord.tnsif.StaticDemo;

public class StaticBlock {
	
	private int num;
	private static String name;
	
	static
	{
		name="Deepal";
	}
	
	//getters & setters
	
	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public static String getName() {
		return name;
	}



	public static void setName(String name) {
		StaticBlock.name = name;
	}



	//static block is used to initialize static variable
	

}
