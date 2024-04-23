package leetcode.editor.cn;

import java.util.*;
public class ID3LongestSubstringWithoutRepeatingCharacters{
	public static void main(String[] args) {
		Solution solution = new ID3LongestSubstringWithoutRepeatingCharacters().new Solution();
		
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
		//解法一 hash表不正确
		/*if(s==""){
			return 0;
		}
		int count = 1;
		int max = count;
		char[] chars = s.toCharArray();
		Set<Character> set = new HashSet<>();
		set.add(chars[0]);
		for(int i = 1; i < chars.length; i++){
			if(set.contains(chars[i])){
				count = 1;
				continue;
			}else{
				count++;
				max = Math.max(max,count);
				set.add(chars[i]);

			}

		}
		return max;*/
		//解法二 双指针
		if(s.length()==0){
			return 0;
		}
		int count = 0;
		int max = count;

		int left = 0;
		int right = 0;

		char[] chars = s.toCharArray();

		Set<Character> set = new HashSet<>();

		while(left<=right && right<s.length()){
			if(!set.contains(chars[right])){
				count++;
				max = Math.max(max,count);
				set.add(chars[right]);
				right++;
			}else{
				left++;
				right = left;
				count = 0;
				set.clear();
			}
		}

		return max;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
