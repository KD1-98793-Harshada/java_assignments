import java.util.Scanner;

public class Invoice {
	private String number;
	private String description;
	private int purchased;
	private int price;
	
	public Invoice(){
		//initialize
		this.number = " ";
		this.description = " ";
		this.purchased = 0;
		this.price = 0;
	}
	public Invoice(String number, String description, int purchased, double price) {
		this.number = number;
		this.description = description;
		this.purchased = purchased;
		this.price = (int) price;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPurchased() {
		return purchased;
	}
	public void setPurchased(int purchased) {
		if (purchased > 0) 
		{
			this.purchased = purchased; 
			}
		else
		{
			this.purchased = 0;
		} 
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) 
	{
		if (price > 0.0)
		{
			this.price = price;
			}
		else
		{
			this.price =  0; 
			} 	
	}
	
	
	public double calInvoice()
	{
		return purchased * price;
		}
	}

