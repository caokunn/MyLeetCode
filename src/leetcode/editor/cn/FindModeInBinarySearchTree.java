package leetcode.editor.cn;

import java.util.*;
class ID501FindModeInBinarySearchTree{
    public static void main(String[] args) {
        Solution solution = new ID501FindModeInBinarySearchTree().new Solution();



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
        List<Integer> res = new ArrayList<>();
        int count=1;
        int maxCount;
        TreeNode pre;
        public int[] findMode(TreeNode root) {
            dfs(root);
            return listToArray(res);
        }
        public static int[] listToArray(List<Integer> list) {
            // 创建一个新的int数组
            int[] result = new int[list.size()];
            // 将List中的元素复制到int数组中
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }
        void dfs(TreeNode node){
            if(node==null){
                return;
            }
            dfs(node.left);

            if(pre!=null){
                if(pre.val==node.val){
                    count++;
                }else{
                    count = 1;
                }
            }

            pre = node;

            if(count==maxCount){
                res.add(node.val);
            }
            if(count>maxCount){
                maxCount = count;
                res.clear();
                res.add(node.val);
            }

            dfs(node.right);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
