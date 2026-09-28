# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapNodes(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        first = head
        sec = head 
        while first and k > 1 :
            first = first.next
            k-=1
        dup = first
        while dup.next :
            dup = dup.next
            sec = sec.next

        temp = first.val
        first.val = sec.val
        sec.val = temp
        return head

