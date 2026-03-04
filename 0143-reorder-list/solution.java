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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //first step
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null; // cut the list
        //second step
        ListNode curr = secondHalf;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //third step
        ListNode cur = head;
        while(prev != null){
            ListNode next1 = cur.next;
            ListNode next2 = prev.next;
            cur.next = prev;
            prev.next = next1;
            cur = next1;
            prev = next2;
        }
    }
}
