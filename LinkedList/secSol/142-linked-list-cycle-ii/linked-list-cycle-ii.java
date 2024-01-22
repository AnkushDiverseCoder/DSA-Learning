/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode cycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
         while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        
        ListNode meetingPoint = cycle(head);
       if(meetingPoint == null){
           return null;
       }
       ListNode start = head;
       while(start!= meetingPoint){
           start = start.next;
           meetingPoint = meetingPoint.next;
       }
       return start;
    }
}