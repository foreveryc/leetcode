package leetcode_everyTest2022;

import java.util.*;

public class lc20220621 {
    public int findBottomLeftValue(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        int count=1;
        TreeNode res;
        TreeNode p=root;

        while(p!=null&&p.left!=null){
            s.push(p);
            p=p.left;
        }

        if (!s.isEmpty()){
            if ()
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) {
                res.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return res;
    }
}
