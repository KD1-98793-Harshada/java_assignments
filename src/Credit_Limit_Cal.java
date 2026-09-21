import java.util.Scanner;

public class Credit_Limit_Cal {

	int acc_no;
	int bal_in_beg;
	int items_charged;
	int credit_applied;
	int allowed_limit;
	
	public void acceptCustomerDetails(Scanner sc) 
	{
		System.out.print("Account Numb: "); 
		acc_no = sc.nextInt();
		
		System.out.print("Balance at beginning: "); 
	    bal_in_beg = sc.nextInt();
		
	    System.out.print("Total items charged : ");
	    items_charged = sc.nextInt();
	    
	    System.out.print("Total credits: "); 
	    credit_applied = sc.nextInt();
	    
	    System.out.print("Allowed credit : "); 
		allowed_limit = sc.nextInt();	
	}
	
	public void cal_Balance()
	{
		int new_balance = bal_in_beg + items_charged - credit_applied; 
		System.out.println("Account Number: " + acc_no);
		System.out.println("New Balance: " + new_balance);
		
		if (new_balance > allowed_limit) {
			System.out.println("Credit limit exceeded");
			} 
		else
		{
			System.out.println("Credit limit not exceeded"); 
			}
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Credit_Limit_Cal customer = new Credit_Limit_Cal();
		customer.acceptCustomerDetails(sc); 
		customer.cal_Balance();
	}
}
