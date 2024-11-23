import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class PreOrderBinaryTree {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        // Visit the root node
        result.add(node.val);

        // Recursively traverse the left subtree
        preorderHelper(node.left, result);

        // Recursively traverse the right subtree
        preorderHelper(node.right, result);
    }

    // Main function to test the code
    public static void main(String[] args) {
        // Example 1
        TreeNode root1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        PreOrderBinaryTree preOrderBinaryTree = new PreOrderBinaryTree();
        System.out.println("Preorder Traversal (Example 1): " + preOrderBinaryTree.preorderTraversal(root1)); // Output: [1, 2, 3]

        // Example 2
        TreeNode root2 = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7))),
                new TreeNode(3, null, new TreeNode(8, null, new TreeNode(9)))
        );
        System.out.println("Preorder Traversal (Example 2): " + preOrderBinaryTree.preorderTraversal(root2)); // Output: [1, 2, 4, 5, 6, 7, 3, 8, 9]

        // Example 3
        TreeNode root3 = null;
        System.out.println("Preorder Traversal (Example 3): " + preOrderBinaryTree.preorderTraversal(root3)); // Output: []

        // Example 4
        TreeNode root4 = new TreeNode(1);
        System.out.println("Preorder Traversal (Example 4): " + preOrderBinaryTree.preorderTraversal(root4)); // Output: [1]
    }
}
