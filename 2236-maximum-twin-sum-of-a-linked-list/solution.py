# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def pairSum(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: int
        """
        slow = head
        fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        
        prev = None
        curr = slow
        while curr:
            nextnode = curr.next
            curr.next = prev
            prev = curr
            curr = nextnode

        res = 0
        curr1 = head
        curr2 = prev

        while curr2 :
            res = max(res, curr1.val + curr2.val)
            curr1 = curr1.next
            curr2 = curr2.next
        return res

