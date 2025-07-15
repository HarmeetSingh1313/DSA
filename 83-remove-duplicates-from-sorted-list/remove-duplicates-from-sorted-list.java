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
    ListNode c=head;
    while(c!=null && c.next!=null)
    {
        while(c.next!=null && c.val==c.next.val)
        {
            c.next=c.next.next;
        }
        c=c.next;
    }
    return head;
    }
}