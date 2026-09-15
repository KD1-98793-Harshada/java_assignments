//Display food menu to user. User will select items from menu along with the 
//quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed 
//prices to food items(hard code the prices)  When user enters 'Generate Bill' 
//option , display total bill & exit. 


import java.util.Scanner;
public class Assignment1_3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	
	int dosa = 40;
	int samosa = 20;
	int idli = 40;
	int chai = 10;
	int totalBill = 0;
	
	int choice = 0;
	
	do
	{
		System.out.println("1.Dosa");
		System.out.println("2.Samosa");
		System.out.println("3.Idli");
		System.out.println("4.Chai");
		System.out.println("5.Generate Bill");
		System.out.println("Enter choice");
		
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: 
			System.out.print("Enter quantity of Dosa: "); 
			int Qty = sc.nextInt(); 
			totalBill += Qty * dosa; 
			System.out.println(  Qty );
			break;
			
		case 2: 
			System.out.print("Enter quantity of Samosa: "); 
			int Qty1 = sc.nextInt(); 
			totalBill += Qty1 * samosa; 
			System.out.println(  Qty1 );
			break;
		
		case 3: 
			System.out.print("Enter quantity of Idli: "); 
			int Qty2 = sc.nextInt(); 
			totalBill += Qty2 * idli; 
			System.out.println(  Qty2 );
			break;
			
		case 4: 
			System.out.print("Enter quantity of Chai: "); 
			int Qty3 = sc.nextInt(); 
			totalBill += Qty3 * chai; 
			System.out.println(  Qty3 );
			break;
		case 5:
			System.out.println("Total bill = " + totalBill);
			break;
		
			}
		}while(choice != 0);
	
	}
}
