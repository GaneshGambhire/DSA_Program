package Demo;


class Stack {
    private int maxSize; 
    private int[] stackArray;
    private int top; 

    
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Initial state of stack, empty
    }

    // Function to add an element to the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to the stack");
        }
    }

    // Function to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            System.out.println("Popped " + stackArray[top] + " from the stack");
            return stackArray[top--];
        }
    }

    // Function to view the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Function to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
public class Stackdsa {

	public static void main(String[] args) {
		Stack stack = new Stack(5); // Stack with maximum size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // Testing overflow condition

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("After popping two elements, top element is: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());

	}

}
