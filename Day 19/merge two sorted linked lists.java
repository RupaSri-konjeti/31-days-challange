class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    // Function to merge two sorted linked lists
    static Node merge(Node head1, Node head2) {

        Node dummy = new Node(0); // Dummy node
        Node tail = dummy;        // Tail points to last node of merged list

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        // Attach remaining nodes
        if (head1 != null) {
            tail.next = head1;
        }

        if (head2 != null) {
            tail.next = head2;
        }

        return dummy.next;
    }

    // Function to print linked list
    static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        // First sorted linked list: 10 -> 30 -> 50
        Node head1 = new Node(10);
        head1.next = new Node(30);
        head1.next.next = new Node(50);

        // Second sorted linked list: 20 -> 40 -> 60
        Node head2 = new Node(20);
        head2.next = new Node(40);
        head2.next.next = new Node(60);

        Node mergedHead = merge(head1, head2);

        System.out.println("Merged Linked List:");
        printList(mergedHead);
    }
}
