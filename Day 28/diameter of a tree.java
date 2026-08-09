class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
    }
}
class Main{
   static int diameter=0;
public static int height(node root){
    
    if(root==null){
        return 0;
    }
    int leftside=height(root.left);
    int rightside=height(root.right);
    int currentdiameter=leftside+rightside;
    diameter=Math.max(diameter,currentdiameter);
    return 1+Math.max(leftside,rightside);
}
public static void main(String args[]){
    node root = new node(1);
    root.left = new node(2);
    root.left.left = new node(3);
    root.left.right=new node(5);
    root.right=new node(6);
    height(root); 
    System.out.println(diameter);
}
}
