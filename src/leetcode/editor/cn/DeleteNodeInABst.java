package leetcode.editor.cn;

import java.util.*;
public class ID450DeleteNodeInABst{
	public static void main(String[] args) {
		Solution solution = new ID450DeleteNodeInABst().new Solution();
		
		
		
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
    public TreeNode deleteNode(TreeNode root, int key) {
        return dfs(root,key);

    }

    TreeNode dfs(TreeNode node,int key){
        if(node==null){
            return node;
        }

        if(node.val>key){
            node.left = deleteNode(node.left,key);
        }else if(node.val<key){
            node.right = deleteNode(node.right,key);
        }else if(node.val==key){
            if(node.left==null&&node.right==null){
                node=null;
            }else if(node.left==null||node.right==null){
                node = node.left==null?node.right:node.left;
            }else if(node.left!=null&&node.right!=null){
                TreeNode tmp = node.left;
                while (tmp.right!=null){
                    tmp = tmp.right;
                }
                node.val = tmp.val;
                node.left = deleteNode(node.left,node.val);
            }

        }
        return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
