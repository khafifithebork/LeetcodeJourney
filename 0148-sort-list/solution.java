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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode sec = split(head);
        ListNode left = sortList(head);     
        ListNode right = sortList(sec);
        return merge(left, right);
    }
    
    public ListNode split(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secHalf = slow.next;
        slow.next = null;
        return secHalf;
    }

    public ListNode merge(ListNode firHalf, ListNode secHalf){
        if(firHalf == null) return secHalf;
        if(secHalf == null) return firHalf;
        if(firHalf.val < secHalf.val){
            firHalf.next = merge(firHalf.next, secHalf);
            return firHalf;
        }
        else{
            secHalf.next = merge(secHalf.next, firHalf);
            return secHalf;
        }
    }
}
