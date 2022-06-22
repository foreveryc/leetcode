package leetcode_everyTest2022;

import java.util.Stack;

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
}
