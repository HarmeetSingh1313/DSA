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
    public boolean isPalindrome(ListNode head) {
       if(head==null || head.next==null)
        return true;
       ListNode slow=head,fast=head;
       while(fast!=null && fast.next!=null)
       {
          slow=slow.next;
          fast=fast.next.next;
       }
       ListNode prev=null,nxt,cur=slow;
       while(cur!=null)
       {
        nxt=cur.next;
        cur.next=prev;
        prev=cur;
        cur=nxt;
       }
       slow=prev;
       fast=head;
       while(slow!=null && fast!=null)
       {
              if(slow.val!=fast.val)
               return false;
            slow=slow.next;
            fast=fast.next; 
       }
    return true; 
    }
}
