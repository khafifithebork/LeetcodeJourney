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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
                curr = curr.next;
                prev = prev.next;
            }
        }
        return dummy.next;
    }
}
