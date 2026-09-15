import java.util.Scanner;

public class Assignment1_1 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number :");
			int x ;
			x = sc.nextInt();
			
			Integer y = new Integer(x);
			String a = y.toBinaryString(x);
			System.out.println(a);
			String b = y.toOctalString(x);
			System.out.println(b);
			String c = y.toHexString(x);
			System.out.println(c);
			
			
		}
}
