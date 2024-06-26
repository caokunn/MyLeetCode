package leetcode.editor.cn;

import java.util.*;
public class ID56MergeIntervals{
	public static void main(String[] args) {
		Solution solution = new ID56MergeIntervals().new Solution();
		
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {

		//贪心算法

		List<int[]> res = new LinkedList<>();
		//先对数组进行排序

		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
		});
		int start = intervals[0][0];
		int end = intervals[0][1];
		for(int i = 1; i < intervals.length; i++){
			if(end >= intervals[i][0]){
				end = Math.max(end,intervals[i][1]);
			}else{
				res.add(new int[]{start,end});
				start = intervals[i][0];
				end = intervals[i][1];
			}
		}
		res.add(new int[]{start,end});
		return res.toArray(new int[res.size()][]);


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
