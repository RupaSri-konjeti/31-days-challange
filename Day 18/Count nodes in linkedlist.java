//count the elements in linkedlist
class node{
    int data ;
    node next;
    
    node (int data){
    this.data=data;
    this.next = null;
}
}
class Main{
    public static void main(String args[])
    {
        node head=new node(10);
        head.next =new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        int count=0;
        node current=head;
        while(current!=null)
        {
            count++;
            current = current.next;
        }
        System.out.println(count);
    }
}
