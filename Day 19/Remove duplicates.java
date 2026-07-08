//Remove Duplicates from Sorted Linked List
class node{
    int data;
    node next;
    
    node(int data){
    this.data=data;
    this.next=null;
    }
 }
 class Main{
     
     static node removeduplicate(node head){
         node current=head;
     
     
     while(current!=null && current.next!=null){
         if(current.data==current.next.data){
             current.next=current.next.next;
         }else{
             current = current.next;
         }
     }
     return head;
     }
     
     static void printlist(node head){
         node current = head;
     
      while(current!=null){
         System.out.println(current.data);
         current=current.next;
      }
     }
     public static void main(String args[])
     {
         node head=new node(10);
         head.next = new node(20);
         head.next.next=new node(20);
         head.next.next.next = new node(40);
         
         head = removeduplicate(head);
         printlist(head);
         
     }
     }
