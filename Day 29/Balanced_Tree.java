// Balanced Tree
class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Binary {

    static int checkheight(node root) {

        if (root == null)
            return 0;

        int leftheight = checkheight(root.left);

        if (leftheight == -1)
            return -1;

        int rightheight = checkheight(root.right);

        if (rightheight == -1)
            return -1;

        if (Math.abs(leftheight - rightheight) > 1)
            return -1;

        return Math.max(leftheight, rightheight) + 1;
    }

    static boolean isBalanced(node root) {
        return checkheight(root) != -1;
    }

    public static void main(String args[]) {

        node root = new node(10);
        root.left = new node(20);
        root.right = new node(30);
        root.left.left = new node(40);
        root.left.right = new node(50);

        if (isBalanced(root))
            System.out.println("balanced");
        else
            System.out.println("not balanced");
    }
}
