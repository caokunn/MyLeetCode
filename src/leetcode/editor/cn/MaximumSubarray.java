package leetcode.editor.cn;

import java.util.*;
public class ID53MaximumSubarray{
	public static void main(String[] args) {
		Solution solution = new ID53MaximumSubarray().new Solution();
		
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
		int result;
    public int maxSubArray(int[] nums) {

		int m = nums.length;
		if(m==0){
			return 0;
		}
		//dp定义：以nums[i]为结尾的最大和
		int[] dp = new int[m];
		dp[0] = nums[0];
		result = dp[0];
		for(int i = 1; i < m; i++){
			dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
			if(dp[i]>result) result = dp[i];
		}
		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
