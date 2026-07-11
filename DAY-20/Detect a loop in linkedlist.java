//identify whether loop exists or not
class node{
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}

class Main{

    static void detectloop(node head){

        node slow = head;
        node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                System.out.println("Loop exists");
                return;
            }
        }

        System.out.println("Loop doesn't exist");
    }

    public static void main(String args[]){

        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);

         head.next.next.next = head.next;  // Creates a loop

        detectloop(head);
    }
}
