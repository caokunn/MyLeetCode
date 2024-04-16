package leetcode.editor.cn;

import java.util.*;
public class ID530MinimumAbsoluteDifferenceInBst{
	public static void main(String[] args) {
		Solution solution = new ID530MinimumAbsoluteDifferenceInBst().new Solution();
		
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)

//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
        TreeNode pre;
    Integer minVal = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return minVal;
    }

    void dfs(TreeNode node){
        if(node==null){
            return;
        }

        dfs(node.left);

        if(pre!=null){
            minVal = Math.min(minVal,node.val - pre.val);
        }
        pre = node;
        dfs(node.right);

    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
