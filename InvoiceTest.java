public class InvoiceTest 
{
	public static void main(String[] args)
	{
		Invoice item1 = new Invoice("222", "wire", 5, 49.99); 
		System.out.println("Invoice 1 Details");
		System.out.println("Part Number : " + item1.getNumber());
		System.out.println("Description : " + item1.getDescription());
		System.out.println("Quantity : " + item1.getPurchased());
		System.out.println("Price/Item : $" + item1.getPrice());
		System.out.println("Total Amount: $" + item1.calInvoice()); 
		System.out.println();
		
		Invoice item2 = new Invoice("111","part2 ",6,50.99); 
		System.out.println("Invoice 2 Details");
		System.out.println("Part Number : " + item2.getNumber()); 
		System.out.println("Description : " + item2.getDescription());
		System.out.println("Quantity : " + item2.getPurchased());
		
		System.out.println("Price/Item : $" + item2.getPrice());
		
		System.out.println("Total Amount: $" + item2.calInvoice());
		 } 
	}