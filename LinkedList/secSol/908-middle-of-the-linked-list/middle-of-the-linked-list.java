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
    public ListNode middleNode(ListNode head) {
        // We will apply tortoise method to solve this problem.

        // Step1:
        ListNode slow = head;
        ListNode fast = head;

        // Step2:
        while(fast != null && fast.next != null)        //<<--Step4
        {
        
            // Step3:
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
}