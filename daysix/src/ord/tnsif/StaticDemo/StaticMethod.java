package ord.tnsif.StaticDemo;
//Program to demonstrate static method
public class StaticMethod {
	
	public static double salary=45000.65;
	public static void display()
	{
		System.out.println("Salary is :"+salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
