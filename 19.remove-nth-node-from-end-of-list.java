/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
	ListNode tempNode = head;
	for(int i = 1; i < n; i++){
	    tempNode = tempNode.next;
	    if(tempNode == null)
		return head;
	}
	ListNode tNode = head;
	ListNode tNode2 = head;
	while(tempNode.next != null){
	    tNode2 = tNode;
	    tNode = tNode.next;
	    tempNode = tempNode.next;
	}
	if(tNode == head)
	    return tNode.next;
	tNode2.next = tNode2.next.next;
	return head;
    }
}
