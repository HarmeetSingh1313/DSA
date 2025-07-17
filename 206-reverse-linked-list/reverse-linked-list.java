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
    public ListNode reverseList(ListNode head) {
       if(head==null || head.next==null)
        return head;
       ListNode t1=new ListNode(-1);
       ListNode t2=t1;
       ListNode c=head;
        while(c.next!=null)
        { 
         if(c.next.next==null)
         {
          t1.next=c.next;
          t1=t1.next;
          c.next=null;
          c=head;
         }
         else
          c=c.next;
        }
       t1.next=head;
    return t2.next;
    }
}