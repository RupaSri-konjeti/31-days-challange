//finding the Intersection node of Two Linked Lists
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
   static int length(node head) {
       int count = 0;
       while(head!=null){
           count++;
           head=head.next;
       }
       return count;
   }
   static node intersection(node head1, node head2){
       int len1 = length(head1);
       int len2 = length(head2);
       int differ = Math.abs(len1-len2);
       
       if(len1>len2){
           for(int i=0;i<differ;i++){
               head1=head1.next;
           }
       }
           else{
                for(int i=0;i<differ;i++){
               head2=head2.next;
           }
       }
       
       while (head1!=null && head2!=null){
           if(head1==head2){
               return head1;
           }
           head1=head1.next;
           head2=head2.next;
       }
       return null;
   }
       
   
    public static void main(String args[])
{
    node common = new node(40);
    common.next =new node(50);
    common.next.next =new node(60);
    
    node head1 = new node (10);
    head1.next = new node (20);
    head1.next.next = new node(30);
    head1.next.next.next=common;
    
    node head2 = new node (100);
    head2.next = new node (200);
    head2.next.next=common;
    node ans=intersection(head1,head2);
    
    if(ans!=null){
        System.out.println(+ans.data);
    }
        else{
                    System.out.println("no intersection");

        }
        
    
}
}
