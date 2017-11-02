/**
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	int cur = 0;
	ListNode l = l1;
	ListNode p = l1;
	while(l1 != null && l2 != null){
	    int a = l1.val;
	    int b = l2.val;
	    l1.val = (a+b+cur) % 10;
	    cur  =(a+b+cur) / 10;
	    p = l1;
	    l1 = l1.next;
	    l2 = l2.next;
	}
	
	if(l2 != null)
	{
	    p.next = l2;
	    l1 = l2;
	}
	
	while(l1 != null){
	    int a = l1.val;
	    l1.val = (a+cur) % 10;
	    cur  = (a+cur) / 10;
	    p = l1;
	    l1 = l1.next;
	}
	
	if(cur != 0){
	    p.next = new ListNode(cur);
	}

	return l;
    }
}
