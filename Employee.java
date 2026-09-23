import java.util.Scanner;

public class Employee {

	private static String first_name;
	private static String last_name;
	private static double salary;

	public Employee(String first_name, String last_name, double salary) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setSalary(double salary) {
		if (salary > 0.0)
		{
			this.salary = salary;
			}
		else
		{
			this.salary =  0; 
			}
	}
	public double getSalary() {
		return salary;
	}
	
}
