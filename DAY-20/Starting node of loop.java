//starting node oof a loop in linkedlist 
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class Main{
    static void startingnode(node head){
    node fast =head;
    node slow=head;
    while(fast!=null && fast.next!=null)
    {
    slow=slow.next;
    fast=fast.next.next;
    
    if(slow==fast)
    {
    slow=head;
    
    while(slow!=fast)
    {
        fast=fast.next;
        slow=slow.next;  
    }
     
        System.out.println(slow.data);
        return;
    }
    }
          System.out.println("No Loop");
    }
        public static void main(String args[]){
            node head = new node(10);
            head.next=new node(20);
            head.next.next =new node(30);
            head.next.next.next=head.next.next;
            startingnode(head);
        }
    }
    
   /*Initialize slow and fast to head.
Move slow by 1 step and fast by 2 steps until they meet.
If fast reaches null, there is no loop.
When slow and fast meet, move slow back to head.
Move both pointers one step at a time.
The node where they meet again is the starting node of the loop.
*/
    
