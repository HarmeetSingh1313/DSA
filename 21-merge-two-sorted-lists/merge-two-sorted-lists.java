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


// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummy=new ListNode(-1);
//        ListNode c=dummy;
//        ListNode p1=list1;
//        ListNode p2=list2;
//        while(p1!=null && p2!=null)
//        {
//         if(p1.val <p2.val)
//         {
//             c.next=p1;
//             p1=p1.next;
//         }
//         else
//         {
//             c.next=p2;
//             p2=p2.next;
//         }
//         c=c.next;
//        }
       
//     c.next=(p1==null)?p2:p1;
//     return dummy.next;   
//     }
// }


//       Recursive Solution

class Solution {
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if(list1 == null)
        return list2;

       if(list2 == null)
        return list1; 

       if(list1.val < list2.val)
       {
         list1.next=mergeTwoLists(list1.next,list2);
         return list1;
       }
       else
       {
        list2.next=mergeTwoLists(list1,list2.next);
        return list2;
       } 
     }
} 

