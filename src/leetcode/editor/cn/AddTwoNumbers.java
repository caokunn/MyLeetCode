package leetcode.editor.cn;

import java.util.*;
public class ID2AddTwoNumbers{
	public static void main(String[] args) {
		Solution solution = new ID2AddTwoNumbers().new Solution();
		
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)

//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Queue<ListNode> queue = new LinkedList<>();
		int gval = 0;
		while(l1!=null||l2!=null){
			int val1 = 0;
			int val2 = 0;
			if(l1!=null) val1 = l1.val;
			if(l2!=null) val2 = l2.val;
			Integer val = val1 + val2 + gval;
			gval = val/10;
			val = val%10;
			queue.offer(new ListNode(val));

			if(l1!=null) l1 = l1.next;
			if(l2!=null) l2 = l2.next;

		}
		if(gval>0){
			queue.offer(new ListNode(gval));
		}
		ListNode res = new ListNode();
		ListNode tmp = res;
		while(!queue.isEmpty()){
			tmp.next = queue.poll();
			tmp= tmp.next;
		}
		return res.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
