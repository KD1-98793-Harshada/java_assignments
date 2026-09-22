import java.util.Scanner;

public class Assignment5_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a string :");
		String string = sc.nextLine();
		
		boolean isPalindrome = true;
		int left = 0;
		int right = string.length() - 1;
		
		while(left < right) {
			if(string.charAt(left) != string.charAt(right)) {
				isPalindrome = false;
				break;
			}
			left++;
			right--;
		}
		if(isPalindrome) {
			System.out.println(string + " is palindrome");
		}
		else {
			System.out.println(string + " is not a palindrome");
		}

	}

}
