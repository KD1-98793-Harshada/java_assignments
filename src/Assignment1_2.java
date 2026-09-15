//Accept 2 double values from User (using Scanner). Check data type. If 
//arguments are not doubles, supply suitable error message & terminate. 
//If numbers are double values, print its average. ////hasNextInt();

import java.util.Scanner;

public class Assignment1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		
		System.out.println("enter a first value");
		if(sc.hasNextDouble() &&  (!sc.hasNextInt()) ) {
			x = sc.hasNextDouble();
			
		System.out.println("Enter second value");
		if(sc.hasNextDouble() &&  (!sc.hasNextInt()) ) {
			y = sc.hasNextDouble();
		}
		else {
			System.out.println("Enter double ");
		}
	
		
	}
}
