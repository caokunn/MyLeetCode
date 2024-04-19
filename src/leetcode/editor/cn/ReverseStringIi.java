package leetcode.editor.cn;

import java.util.*;
public class ID541ReverseStringIi{
	public static void main(String[] args) {
		Solution solution = new ID541ReverseStringIi().new Solution();
		
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseStr(String s, int k) {
		//感觉像屎山代码...时间效率这么低
		char[] chars = s.toCharArray();
		for(int i = 0; i < chars.length; i=i+2*k){
			if(chars.length-i-1<k){
				reverseString(chars,i,chars.length-1);
			}else{
				reverseString(chars,i,i+k-1);
			}

		}
		String res = "";
		for(int i = 0; i < chars.length; i++){
			res+=chars[i];
		}
		return res;
	}

	void reverseString(char[] chars,int start,int end){
		for(int i = start,j=end; i < j; i++,j--){
			char c = chars[j];
			chars[j] = chars[i];
			chars[i] = c;
		}
	}


}
//leetcode submit region end(Prohibit modification and deletion)

}
