//Delete the node at a specific position 
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
        head.next.next.next=new node(40);
        int position =3;
        }
        if(head.next==null)
        {
            head=null;
        }
        else{ 
       
        node current=head;
        
        for(int i=1;i<position-1;i++)//10,20,30,40
        {
            current=current.next;// no relation for this and line below current .next because its a loop
        }
            current.next = current .next.next;
            
            node temp=head;
            while(temp!=null){
                temp=tempt.data;
            }
        }
        
    }
}
