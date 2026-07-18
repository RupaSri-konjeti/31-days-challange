//Merge sort
class node{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Main{
//middle
static node middle(node head){
    node fast=head.next;
    node slow = head;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}
    //spillting
    static node mergesort(node head){
        //base case
if(head == null || head.next ==null)
return head;
node mid = middle(head);
node right = mid.next;
node left = head;
mid.next=null;
left =mergesort(left);
right = mergesort(right);
return merge(left,right);
}
//comapring
static node merge(node head1,node head2){
node dummy = new node(-1);
node temp=dummy;
while(head1!=null && head2!=null){
if(head1.data <= head2.data){
    temp.next=head1;
    head1=head1.next;
}
    else{
        temp.next =head2;
        head2=head2.next;
    }
    temp=temp.next;
}

// if any nodes reminds
if(head1!=null){
    temp.next=head1;
}
    else{
        temp.next = head2;
    }
    return dummy.next;
    
}

static void print(node head)
{
    while(head!=null){
        System.out.print(head.data + " ");
        head=head.next;
    }
}
public static void main (String args[]){

        node head = new node(4);
        head.next = new node(2);
        head.next.next = new node(1);
        head.next.next.next = new node(3);
        head=mergesort(head);
        print(head);
        
}
}
/* class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {

    // Merge Sort
    static Node mergeSort(Node head) {

        // Base Case
        if (head == null || head.next == null)
            return head;

        // Find Middle
        Node middle = getMiddle(head);

        // Split List
        Node right = middle.next;
        middle.next = null;

        // Sort Left and Right
        Node left = mergeSort(head);
        right = mergeSort(right);

        // Merge
        return merge(left, right);
    }

    // Find First Middle
    static Node getMiddle(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge Two Sorted Lists
    static Node merge(Node head1, Node head2) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        if (head1 != null)
            temp.next = head1;
        else
            temp.next = head2;

        return dummy.next;
    }

    // Print List
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        head = mergeSort(head);

        print(head);
    }
}*/
