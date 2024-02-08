/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//  How to become another person in the world? Two steps.
// One, change your appearance to whom you want to be.
// Two, kill that person.
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
	    node.next = node.next.next;
    }
}