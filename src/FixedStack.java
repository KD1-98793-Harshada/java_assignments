package assignment_8;

public class FixedStack implements Stack {
	private Employee[] empArr;
	private int top;
	
	public FixedStack() {
		empArr = new Employee[Stack_size];
		top = -1;
	}
	
	@Override
	public void push(Employee emp) {
		if(top == Stack_size - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		empArr[++top] = emp;
		System.out.println("element pushed");
	}
	@Override
	public Employee pop() {
		if(top == -1) {
			System.out.println("Stack underflow");
			return null;
		}
		return empArr[top--];
	}

}
