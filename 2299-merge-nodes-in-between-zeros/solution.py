# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeNodes(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        curr = head.next
        dummy = ListNode(0)
        write = dummy
        total = 0
        while curr :
            if curr.val == 0 :
                write.next = ListNode(total)
                write = write.next
                total = 0
            else :
                total += curr.val
            curr= curr.next
        return dummy.next
