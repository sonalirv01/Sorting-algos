import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */


class PostOrderBinaryTree {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }



        // Recursively traverse the left subtree
        postorderHelper(node.left, result);

        // Recursively traverse the right subtree
        postorderHelper(node.right, result);
        // Visit the root node
        result.add(node.val);
    }

    // Main function to test the code
    public static void main(String[] args) {
        // Example 1
        TreeNode root1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        PostOrderBinaryTree pobt = new PostOrderBinaryTree();
        System.out.println("Preorder Traversal (Example 1): " + pobt.postorderTraversal(root1)); // Output: [1, 2, 3]

        // Example 2
        TreeNode root2 = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7))),
                new TreeNode(3, null, new TreeNode(8, null, new TreeNode(9)))
        );
        System.out.println("Postorder Traversal (Example 2): " + pobt.postorderTraversal(root2)); // Output: [1, 2, 4, 5, 6, 7, 3, 8, 9]

        // Example 3
        TreeNode root3 = null;
        System.out.println("Postorder Traversal (Example 3): " + pobt.postorderTraversal(root3)); // Output: []

        // Example 4
        TreeNode root4 = new TreeNode(1);
        System.out.println("Postorder Traversal (Example 4): " + pobt.postorderTraversal(root4)); // Output: [1]
    }
}
