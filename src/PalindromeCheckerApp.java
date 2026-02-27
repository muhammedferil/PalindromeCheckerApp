import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String text) {
        // Remove spaces and convert to lowercase
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a word or sentence: ");

        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("✅ \"" + input + "\" is a Palindrome!");
        } else {
            System.out.println("❌ \"" + input + "\" is NOT a Palindrome!");
        }

        scanner.close();
    }
}
