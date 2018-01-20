/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	ListNode res = new ListNode(0);
	ListNode tNode = res;
	while(l1 !=null && l2 !=null){
	    if(l1.val > l2.val){
		tNode.next = new ListNode(l2.val);
		l2 = l2.next;
	    }else{
		tNode.next = new ListNode(l1.val);
		l1 = l1.next;
	    }
	    tNode = tNode.next;
	}
	if(l1 == null){
	    tNode.next = l2;
	}else if(l2 == null){
	    tNode.next = l1;
	}
	return res.next;
    }
}
