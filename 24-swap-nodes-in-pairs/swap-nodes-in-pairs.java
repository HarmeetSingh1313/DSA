// class Solution {
//     public ListNode swapPairs(ListNode head) {

//         if (head == null || head.next == null) {
//             return head;
//         }
  
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode prev = dummy;

//         while (prev.next != null && prev.next.next != null) {
//             ListNode first = prev.next;
//             ListNode second = first.next;

            
//             first.next = second.next;
//             second.next = first;
//             prev.next = second;

            
//             prev = first;
//         }

//         return dummy.next;
//     }
// }

class Solution {
    public ListNode swapPairs(ListNode head) {
    ListNode dummy=new ListNode(-1);
    dummy.next=head;
    ListNode c=dummy;
    if(c.next==null || c.next.next==null)
     return head;
    while(c.next!=null && c.next.next!=null)
    {
        ListNode first=c.next;
        ListNode second=first.next;

        first.next=second.next;
        second.next=first;
        c.next=second;

        c=first;
    } 
    return dummy.next;
    }
}
