//palindrome of a  linkedlist
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
    static node reverse(node head)
    {
       node prev=null;
        node next=null;
        node current=head;
        
            while(current!=null){
            next = current.next;
            current.next=prev;
            prev = current;
            current=next;
            }   
        
        return prev;
    }
    
    static boolean palindrome (node head){
        if(head == null || head.next == null)
        return true;
        node slow = head; 
        node fast = head; 
        while(fast!=null && fast.next!=null)
        {
              slow = slow.next;
              fast=fast.next.next;
        }
        
        if(fast!=null){//fast is not null, so we move slow one step to skip the middle element (30)
            slow=slow.next;
        }
    
    node secondhalf = reverse(slow);
    node firsthalf = head;
    while(secondhalf !=null )
    {
        if(firsthalf.data != secondhalf.data)
        return false;
        
        firsthalf=firsthalf.next;
    secondhalf=secondhalf.next;

  }
  return true;
    }
    
    public static void main (String args[])
    {
        node head = new node(10);
        head.next = new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(20);
        head.next.next.next.next=new node(10);
        System.out.println(palindrome(head));
        
    }
}
/* If the list has 0 or 1 node, return true.
Use slow and fast pointers to find the middle of the linked list.
If the list has an odd number of nodes, move slow one step forward to skip the middle node.
Reverse the second half of the linked list starting from slow.
Compare the first half and the reversed second half node by node.
If any pair of nodes differs, return false.
If all compared nodes match, return true.

Time Complexity: O(n)
Space Complexity: O(1)*/
