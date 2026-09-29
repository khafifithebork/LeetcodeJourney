# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        length = 0
        cur = head
        while cur :
            length += 1
            cur = cur.next
        if length == 0 : return head
        rotations = k % length
        
        if rotations == 0 : return head
        
        first = head
        second = head
        
        while rotations >= 1 :
            first = first.next
            rotations -=1
        
        while first.next :
            first = first.next
            second = second.next
        
        first.next = head
        new_head = second.next
        second.next = None
        return new_head
