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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode beforeLeft = dummy;
        ListNode afterRight = head;
        while(left>1){
            beforeLeft = beforeLeft.next;
            left--;
        }
        ListNode leftt = beforeLeft.next;
        while(right>1){
            afterRight = afterRight.next;
            right--;
        }
        ListNode rightt = afterRight;
        afterRight = afterRight.next;
        ListNode prev = beforeLeft;
        ListNode curr = leftt;
        while(curr != afterRight){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr=temp;
        }
        beforeLeft.next = rightt;
        leftt.next = afterRight;
        return dummy.next;
    }
}
