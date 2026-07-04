class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {
    public static void main(String args[]) {

        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);

        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Node = " + slow.data);
    }
}
