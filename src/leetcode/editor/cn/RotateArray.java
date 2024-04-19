package leetcode.editor.cn;

import java.util.*;
public class ID189RotateArray{
	public static void main(String[] args) {
		Solution solution = new ID189RotateArray().new Solution();
		
		solution.rotate(new int[]{1,2,3,4,5,6,7},3);
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
		void reverse(int[] nums,int start,int end){
			for(int i = start,j = end; i < j; i++,j--){
				int temp;
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			}
		}
    public void rotate(int[] nums, int k) {
		//原地实现数组轮转
		//先局部再整体
		k = k%nums.length;
		reverse(nums,0,nums.length-k-1);
		reverse(nums,nums.length-k,nums.length-1);
		reverse(nums,0,nums.length-1);


		//先整体再局部
//		k = k%nums.length;
//		reverse(nums,0,nums.length-1);
//		reverse(nums,0,k-1);
//		reverse(nums,k,nums.length-1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
