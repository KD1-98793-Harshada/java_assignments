
import java.util.Scanner;

public class Assignment5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Trim 
        String trimmed = input.trim();

        //Handle empty string
        if (trimmed.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            //Split by one or more spaces
            String[] words = trimmed.split("\\s+");

            //word count
            System.out.println("Number of words in the string: " + words.length);
        }
    }
}
