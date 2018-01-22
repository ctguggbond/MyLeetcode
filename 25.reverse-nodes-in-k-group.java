/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
	if(head == null || head.next == null)
	    return head;
	
	ListNode t = head;
	int i = 0;
	while(++i < k){
	    t = t.next;
	    if(t == null)
		return head;
	}

	i = 0;
	ListNode t1 = head;
	ListNode t2 = head.next;
	ListNode t3 = head;
	while(t2 != null && ++i < k){
		t3 = t2;
		t2 = t2.next;
		t3.next = t1;
		t1 = t3;
	}
	
	head.next = reverseKGroup(t2,k);
	return t3;
    }
}
