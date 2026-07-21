// Stack using Array

class Stack {

    int[] arr = new int[5];
    int top = -1;

    // Push
    void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = data;
    }

    // Pop
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + arr[top]);
        top--;
    }

    // Peek
    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Top Element: " + arr[top]);
    }
}

public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.peek();

        s.pop();

        s.push(40);

        s.peek();
    }
}
