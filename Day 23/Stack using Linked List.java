// Stack using Linked List

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {

    Node top = null;

    // Push
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    // Peek
    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Top Element: " + top.data);
    }

    // Display
    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        s.peek();

        s.pop();

        s.display();
    }
}
