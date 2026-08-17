//right view 
import java.util.*;
class node{
    int data;
    node left,right;
    node(int data){
        this.data=data;
        node right,left;
    }
}
class Main{
    
        static void rightview(node root){
            if(root==null)
            return;
            Queue<node> q = new LinkedList<>();
            q.add(root);
            int size=q.size();
            while(!q.isEmpty()){
            for(int i=0;i<size;i++){
                node current = q.poll();//Remove the first element from the Queue and return that removed element.
                   if(i==size-1)
                   System.out.println(current.data);
                   
                   if(current.left!=null)
                   q.add(current.left);
                   
                   if(current.right!=null)
                   q.add(current.right);
                  
                  
            }
        }
    }
    public static void main(String args[]){
                      node root = new node(10);
                      root.left=new node(20);
                      root.left.left=new node(30);
                      root.right=new node(40);
                      root.right.left=new node(50);
                      root.right.left.left=new node(60);
                      
                     rightview(root);
}
}
