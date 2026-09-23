import math
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def insertGreatestCommonDivisors(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        curr = head 
        while curr.next :
            nnode = ListNode(math.gcd(curr.val, curr.next.val))
            nnode.next = curr.next
            curr.next = nnode
            curr = curr.next.next
        return head
