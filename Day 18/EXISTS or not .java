//search an element in linkedlist 
//if found =1 else found =0
class node {
    int data;
    node next;
    
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class Main{
    public static void main(String args[])
    {
        node head = new node (10);
        head.next = new node (20);
        head.next.next =new node (30);
        head.next.next.next =new node (40);
        node current =head;
        int key=40;
        int found =0;
       
        while(current!=null){
            if(current.data==key){
                found =1;
                break;
            }
            current =current.next;
        
        }
        System.out.println(found);
    }
}
