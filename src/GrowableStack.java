package assignment_8;

public class GrowableStack implements Stack {

	private Employee[] empArr;
	private int top;
	
	public GrowableStack() {
		empArr = new Employee[Stack_size];
		top = -1;
	}
	
	@Override
	public void push(Employee emp) {

		if(top == empArr.length - 1 ) {
		
		Employee[] tempArr = new Employee[empArr.length * 2];
		for(int  i = 0;i <= top;i++) {
			tempArr[i] = empArr[i];			
		}
		empArr = tempArr;
		System.out.println("Stack is full");
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


