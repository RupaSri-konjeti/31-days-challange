//Circular Queue implementation
class CircularQueue {

    int[] arr;
    int front, rear, size;

    CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (rear + 1) % size == front;
    }

    void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = data;
    }

    void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted: " + arr[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    void peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front Element: " + arr[front]);
        }
    }

    void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(arr[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % size;
        }

        System.out.println();
    }
}
class Main{
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        q.dequeue();
        q.dequeue();

        q.display();

        q.enqueue(50);
        q.enqueue(60);

        q.display();

        q.peek();
    }
}
