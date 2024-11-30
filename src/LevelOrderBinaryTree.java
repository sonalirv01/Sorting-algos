import java.util.*;

class TreeNode2 {
    int value;
    TreeNode2 left, right;

    TreeNode2(int value) {
        this.value = value;
        left = right = null;
    }
}
public class LevelOrderBinaryTree {

        public static void levelOrder(TreeNode2 root) {
            if (root == null) {
                return;
            }

            Queue<TreeNode2> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode2 currentNode = queue.poll();
                System.out.print(currentNode.value + " ");

                // Add the left child to the queue
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                // Add the right child to the queue
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }

        public static void main(String[] args) {
            // Example tree:
            //         1
            //       /   \
            //      2     3
            //     / \   / \
            //    4   5 6   7

            TreeNode2 root = new TreeNode2(1);
            root.left = new TreeNode2(2);
            root.right = new TreeNode2(3);
            root.left.left = new TreeNode2(4);
            root.left.right = new TreeNode2(5);
            root.right.left = new TreeNode2(6);
            root.right.right = new TreeNode2(7);

            System.out.println("Level Order Traversal:");
            levelOrder(root);
        }
    }


