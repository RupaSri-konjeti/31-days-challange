//Delete the last node 
class node{
    int data;
    node next;
    node (int data){
    this.data=data;
    this.next=null;
}
}
class Main{
    public static void main(String args[])
    {
        node head = new node (10);
        head.next = new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);//10 20 30 40
        
        node current =head;
        
        while(current.next.next!=null){
            current=current.next;
            
        }
        current.next =null;
        
        current = head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
}
/*
// Delete the last node

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

        // Create Linked List
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);

        // Start from head
        node current = head;

        // Move to the second-last node
        while (current.next.next != null) {
            current = current.next;
        }

        // Delete the last node
        current.next = null;

        // Start again from head to print the updated list
        current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
*/
