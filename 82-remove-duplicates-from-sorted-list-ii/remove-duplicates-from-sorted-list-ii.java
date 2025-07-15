/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    ListNode dummy=new ListNode(-1);
    dummy.next=head;
    ListNode p=dummy;
    ListNode c=head;
    while(c!=null)
    {
        if(c.next!=null && c.val==c.next.val)
        {
            int t=c.val;
            while(c!=null && c.val==t)
            {
                c=c.next;
            }
            p.next=c;
        }
        else
        {
            p=c;
            c=c.next;
        }
    }
    return dummy.next;
    }
}