package leetcode.editor.cn;

import java.util.*;
public class ID235LowestCommonAncestorOfABinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID235LowestCommonAncestorOfABinarySearchTree().new Solution();
		
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)

//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p, q);
    }

	TreeNode dfs(TreeNode node,TreeNode p,TreeNode q){
		if(node==null){
			return node;
		}

		if(node.val>p.val&&node.val>q.val){
			return dfs(node.left,p,q);
		}
		if(node.val<p.val&&node.val<q.val){
			return dfs(node.right,p,q);
		}
		return node;

	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
