// left view 
import java.util.*;
class node{
    int data;
    node left,right;
    node(int data){
        this.data=data;
    }
}
class Main{
    public static void leftview(node root){
        if(root==null)
            return;
        Queue<node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                node current=q.poll();
                if(i==0)
                System.out.println(current.data );
                if(current.left!=null)
                q.add(current.left);
                if(current.right!=null)
                q.add(current.right);
                }
                
                
            }
            
        }
    
        public static void main (String args[]){
        node root = new node(10);
        root.left=new node(20);
        root.right=new node(40);
        root.left.right=new node(30);
        root.left.left=new node(50);
        root.left.left.left=new node(60);
        leftview(root);
        }
}
    
