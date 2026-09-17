
import java.util.Scanner;
import com.app.geometry.Point2D;
public class TestPoint
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter x and y coordinates for Point 1: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		System.out.print("Enter x and y coordinates for Point 2: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		// Create two Point2D objects
		
		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);
		// Display details of both points
		
		System.out.println("p1 details: " + p1.getDetails());
		System.out.println("p2 details: " + p2.getDetails());
		// Check if points are at the same location or calculate distance
		
		if (p1.isEqual(p2))
		{
			System.out.println("p1 , p2 are same position.");
			}
		else 
		{ 
			System.out.println("p1 , p2 are  at different positions.");
			
			double dist = p1.CalculateDistance(p2);
			System.out.println("Distance between p1 and p2 is: " + dist); 
			} 
		} 
	}
