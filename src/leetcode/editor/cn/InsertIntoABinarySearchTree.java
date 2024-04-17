package leetcode.editor.cn;

import java.util.*;
public class ID701InsertIntoABinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID701InsertIntoABinarySearchTree().new Solution();
		
		
		
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return dfs(root, val);
    }

    TreeNode dfs(TreeNode node,int val){
		if(node==null){
			TreeNode child = new TreeNode(val);
            return child;
		}


		if(node.val>val){
            node.left = dfs(node.left,val);
        }
        if(node.val<val){
            node.right = dfs(node.right,val);
        }
        return node;

	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
