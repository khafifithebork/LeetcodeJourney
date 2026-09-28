# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def partition(self, head, x):
        """
        :type head: Optional[ListNode]
        :type x: int
        :rtype: Optional[ListNode]
        """
        lessdum = ListNode(0)
        greatdum = ListNode(0)
        lesstail = lessdum
        greatail = greatdum
        curr = head
        
        while curr :
            
            if curr.val < x :
                lesstail.next = curr
                lesstail = lesstail.next
            else :
                greatail.next = curr
                greatail = greatail.next
            curr = curr.next
        
        lesstail.next = greatdum.next
        greatail.next = None
        
        return lessdum.next

