//depth of the binary tree 
import java.util.Scanner;
class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
    }
}
public class Main{
    public static int max(node root){
    if(root==null)
        return 0;
        int leftdepth = max(root.left);
        int rightdepth = max(root.right);
        return 1+Math.max(leftdepth,rightdepth);
    }
    
    public static void main(String args[]){
        node root = new node(1);
        root.left = new node(2);
        root.left.left = new node(4);
        root.left.left.left=new node(5);
        root.right = new node(3);
        System.out.println(max(root));
        
    }
}
