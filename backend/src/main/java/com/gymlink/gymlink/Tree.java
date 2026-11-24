
import java.util.*;

public class Tree {

    public class TreeNode<E> {
        E data;
        TreeNode<E> left;
        TreeNode<E> right;

        public TreeNode(E data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public ArrayList<Integer> BFS(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode<Integer> current = queue.poll();

            res.add(current.data);

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return res;
    }
}
