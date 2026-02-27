import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class palindromecheckerapp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Insert characters into Stack and Queue
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue (FIFO) with pop (LIFO)
        for (int i = 0; i < input.length(); i++) {

            char fromQueue = queue.poll();  // FIFO
            char fromStack = stack.pop();   // LIFO

            if (fromQueue != fromStack) {
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