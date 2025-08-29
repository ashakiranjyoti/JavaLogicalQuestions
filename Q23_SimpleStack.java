Write a program to implement a stack in 
public class Stack {

    // Array to store stack elements
    private int[] arr;

    // Index of the top element in the stack
    private int top;

    // Maximum capacity of the stack
    private int capacity;

    // Constructor to initialize the stack with a given size
    public Stack(int size) {
        arr = new int[size];  // allocate memory for stack
        capacity = size;      // set maximum size
        top = -1;             // initialize top to -1 (stack is empty)
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to add an element to the stack (push operation)
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full");  // warning if stack is full
            System.exit(1);                       // terminate the program
        }
        arr[++top] = x;  // increment top and add element
    }

    // Method to remove and return the top element from the stack (pop operation)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");  // warning if stack is empty
            System.exit(1);                         // terminate the program
        }
        return arr[top--];  // return top element and decrement top
    }
}

