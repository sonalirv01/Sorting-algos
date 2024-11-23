import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */


class InOrderBinaryTree {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }



        // Recursively traverse the left subtree
        inorderHelper(node.left, result);

        // Recursively traverse the right subtree
        inorderHelper(node.right, result);

    }

    // Main function to test the code
    public static void main(String[] args) {
        // Example 1
        TreeNode root1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        InOrderBinaryTree inobt = new InOrderBinaryTree();
        System.out.println("IN Order Traversal (Example 1): " + inobt.inorderTraversal(root1)); // Output: [1, 2, 3]

        // Example 2
        TreeNode root2 = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7))),
                new TreeNode(3, null, new TreeNode(8, null, new TreeNode(9)))
        );
        System.out.println("InOrder  Traversal (Example 2): " + inobt.inorderTraversal(root2)); // Output: [1, 2, 4, 5, 6, 7, 3, 8, 9]

        // Example 3
        TreeNode root3 = null;
        System.out.println("InOrder  Traversal (Example 3): " + inobt.inorderTraversal(root3)); // Output: []

        // Example 4
        TreeNode root4 = new TreeNode(1);
        System.out.println("InOrder  Traversal (Example 4): " + inobt.inorderTraversal(root4)); // Output: [1]
    }
}
