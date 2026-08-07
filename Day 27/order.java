class node{
    int data;
    node left,right;
    node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class Main{
public static void preorder(node root){
    if(root==null)
        return;
    
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
    
}public static void inorder(node root){
    if(root==null)
        return;
     inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
    
}public static void postorder(node root){
    if(root==null)
        return;
    postorder(root.left);
    postorder(root.right);
     System.out.print(root.data + " ");
    
}
    public static void main (String args[]){
        node root = new node(10);
        root.left = new node(20);
        root.right = new node(30);
        root.left.left = new node(40);
        root.left.right=new node(50);
        root.right.left = new node(60);
        System.out.println("preorder");
        preorder(root);
        System.out.println(" ");
        System.out.println("inorder");
        inorder(root);
        System.out.println(" ");
        System.out.println("postorder");
        postorder(root);
    }
}
