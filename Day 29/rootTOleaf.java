class node {
    int data;
    node left, right;

    // Constructor
    node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Main {

    // Function to check Root-to-Leaf Path Sum
    static boolean pathSum(node root, int targetSum) {

        // If root is null, no path exists
        if (root == null)
            return false;

        // If current node is a leaf node
        if (root.left == null && root.right == null) {

            // Check whether leaf value equals target
            return root.data == targetSum;
        }

        // Subtract current node value from target
        int remainingSum = targetSum - root.data;

        // Check left subtree OR right subtree
        return pathSum(root.left, remainingSum)
                || pathSum(root.right, remainingSum);
    }

    public static void main(String[] args) {

        // Create the tree
        node root = new node(10);

        root.left = new node(5);
        root.right = new node(8);

        root.left.left = new node(3);
        root.left.right = new node(7);

        // Target sum
        int targetSum = 22;

        // Call function
        boolean result = pathSum(root, targetSum);

        // Print result
        System.out.println(result);
    }
}
