import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop and display elements from the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
