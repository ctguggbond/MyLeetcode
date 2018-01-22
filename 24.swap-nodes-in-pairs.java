/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
	
	ListNode temp = new ListNode(0);
	temp.next = head;
	ListNode t = temp;
	ListNode t1 = null;
	while(temp != null && temp.next != null){
	    if(temp.next.next != null){
		t1 = temp.next.next;
		temp.next.next = temp.next.next.next;
		t1.next = temp.next;
		temp.next = t1;
	    }
	    temp = temp.next.next;
	}

	return t.next;
    }
}
