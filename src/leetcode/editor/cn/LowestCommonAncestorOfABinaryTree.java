package leetcode.editor.cn;

import java.util.*;
public class ID236LowestCommonAncestorOfABinaryTree{
	public static void main(String[] args) {
		Solution solution = new ID236LowestCommonAncestorOfABinaryTree().new Solution();
		
		
		
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
		if(node==p||node==q||node==null){
			return node;
		}
		TreeNode left = dfs(node.left,p,q);
		TreeNode right = dfs(node.right,p,q);


		if(left!=null&&right!=null){
			return node;
		}

		if(left!=null&&right==null){
			return left;
		}
		else if(left==null&&right!=null){
			return right;
		}else{
			return null;
		}



	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
