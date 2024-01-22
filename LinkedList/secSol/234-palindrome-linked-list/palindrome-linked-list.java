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
    public ListNode reverseSecHalf(ListNode head){
       
        ListNode curr = head;
        ListNode prev = null;
        while(curr!= null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        if(prev == null){
            return head;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // Find The Mid
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse Second Half

        ListNode head2 = reverseSecHalf(slow);
        while(head2!=null ){
            if(head.val != head2.val){
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
}