package leetcode.editor.cn;

import java.util.*;
public class ID669TrimABinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID669TrimABinarySearchTree().new Solution();
		
		
		
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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null){
            return root;
        }

        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);
        if(root.val<low){
            return root.right;
        }
        if(root.val>high){
            return root.left;
        }
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
