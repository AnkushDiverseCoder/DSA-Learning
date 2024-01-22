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
        // Iterative
        // Three pointer algorithm 
        // prev curr next 
            // ListNode prev = null;
            // ListNode curr = head;
            // while(curr != null){
            //     ListNode nxt = curr.next;
            //     curr.next = prev;
            //     prev = curr;
            //     curr = nxt;
            // }
            // return prev;

        // Recursive
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;

    }
}