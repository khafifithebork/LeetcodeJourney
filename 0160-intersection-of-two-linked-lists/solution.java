/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        ListNode currA = headA;
        while (currA != null) {
            sizeA++;
            currA = currA.next;
        }
        int sizeB = 0;
        ListNode currB = headB;
        while (currB != null) {
            sizeB++;
            currB = currB.next;
        }
        int diff = sizeB-sizeA;
        ListNode i = headA;
        ListNode j = headB;
        if(diff < 0){
            while(diff < 0){
                i=i.next;
                diff++;
            }
        }
        if(diff>0){
            while(diff>0){
                j=j.next;
                diff--;
            }
        }
        while(i != j && i!=null && j!=null){
            i=i.next;
            j=j.next;
        }
        return i;
    }
}
