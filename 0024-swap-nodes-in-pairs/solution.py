# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapPairs(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        dummy = ListNode(0)
        curr = head
        dummy.next = head
        prev = dummy
        while curr and curr.next :
            temp = curr.next
            curr.next = temp.next
            temp.next = curr
            prev.next = temp
            prev = curr
            curr = curr.next
        return dummy.next
            
