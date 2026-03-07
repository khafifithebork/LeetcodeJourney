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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        ListNode bNode = list1;
        int counta = 0;
        int countb = 0;
        while(countb < b+1){
            bNode = bNode.next;
            countb++;
        }
        while(counta < a-1){
            curr = curr.next;
            counta++;
        }
        curr.next = list2;
        while(curr != null && curr.next != null){
            curr = curr.next;
        }
        curr.next = bNode;
        return list1;
    }
}
