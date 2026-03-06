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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        ListNode prev = dummy;
        dummy.next = head;
        while(curr!=null){
            if(curr.val==val){
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
        return dummy.next;

    }
}
