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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ll = new ListNode();
        ListNode head =ll;
        ListNode tail =ll;
        ListNode f = list1;
        ListNode s = list2;

        while(f!= null && s!=null){
            if(f.val < s.val){
                tail.next = f;
                f = f.next;
                tail = tail.next;
            }else{
                tail.next = s;
                s = s.next;
                tail = tail.next;
            }
        }

        while(f!=null){
             tail.next = f;
                f = f.next;
                tail = tail.next;
        }
        while(s!=null){
             tail.next = s;
                s = s.next;
                tail = tail.next;
        }
        return head.next;
    }
}