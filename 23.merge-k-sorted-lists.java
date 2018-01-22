/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
	int len = lists.length;
        if(lists == null || len == 0)
	    return null;
	PriorityQueue<ListNode> p = new PriorityQueue<ListNode>(len,new Comparator<ListNode>(){
                @Override
                public int compare(ListNode o1,ListNode o2){
                    if (o1.val<o2.val)
                        return -1;
                    else if (o1.val==o2.val)
                        return 0;
                    else
                        return 1;
                }
            });

	ListNode head = new ListNode(0);
	ListNode tail = head;
	for(int i = 0; i < len; i++){
	    if(lists[i] != null)
		p.add(lists[i]);
	}
	
	while(!p.isEmpty()){
	    tail.next = p.poll();
	    tail = tail.next;
	    if(tail.next != null){
		p.add(tail.next);
	    }
	}
	return head.next;
    }
}
