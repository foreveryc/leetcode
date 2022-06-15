package Leetcode_everydayTest;

public class Test006 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode head = null;
        buildtree(head, null);
    }

    public static TreeNode buildtree(ListNode left, ListNode right) {
        if (left == right) {
            return null;
        }
        ListNode mid = getMid(left, right);
        TreeNode root=new TreeNode(mid.val);
        root.left=buildtree(left,mid);
        root.right=buildtree(mid.next,right);
        return root;
    }

    public static ListNode getMid(ListNode left, ListNode right) {
        ListNode frist=left;
        ListNode second=left;
        while(frist.next!=right&&frist!=right){
            frist=frist.next;
            frist=frist.next;
            second=second.next;
        }
        return second;
    }


    /**
     *判断是否是      平衡二叉树
     *
     */

    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

}
