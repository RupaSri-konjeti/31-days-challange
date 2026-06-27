//Insert a node at the end.
class node{
    int data;
    node next;
      
    node(int data){
        this . data = data;
        this .next = null;
    }
}
class Main {
    public static void main(String args[])
    {
        node head = new node(10);
        head .next =new node(20);
        head .next.next = new node (30);
         
        node newnode = new node (40);
        node current = head;
        while(current.next!= null){
            current=current.next;
        }
        
        current.next = newnode;

        current = head;
        
        while(current!=null){
            System.out.println(current.data);
            current =current.next;
        }

    }
}
