import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class palindromecheckerapp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Character> deque = new ArrayDeque<>();

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Insert characters into Deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        scanner.close();
    }
}