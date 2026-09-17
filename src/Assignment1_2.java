import java.util.Scanner;

public class Assignment1_2 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first value: ");
	        if (!sc.hasNextDouble()) {
	            System.out.println("Error");
	            return; 
	        }
	        double x = sc.nextDouble();

	        System.out.print("Enter second value: ");
	        if (!sc.hasNextDouble()) {
	            System.out.println("Error");
	            return;
	        }
	        double y = sc.nextDouble();

	        double average = (x + y) / 2;
	        System.out.println("Average of " + x + " and " + y + " is: " + average);
	    }
	}