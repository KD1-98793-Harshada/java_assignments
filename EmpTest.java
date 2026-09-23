
public class EmpTest {

public static void main(String[] args)
{
	Employee Emp1 = new Employee("Roshini", "D", 5000.00); 
	System.out.println("First name : " + Emp1.getFirst_name());
	System.out.println("Last name : " + Emp1.getLast_name());
	System.out.println("Salary :" + Emp1.getSalary());
	
	Employee Emp2 = new Employee("Sandhya", "M", 6000.40); 
	System.out.println("First name : " + Emp2.getFirst_name());
	System.out.println("Last name : " + Emp2.getLast_name());
	System.out.println("Salary :" + Emp2.getSalary());
	
	 } 
}