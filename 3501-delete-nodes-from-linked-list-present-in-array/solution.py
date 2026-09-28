# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def modifiedList(self, nums, head):
        """
        :type nums: List[int]
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        dummy = ListNode(None)
        dummy.next = head
        seen = set(nums)

        curr = dummy
        while curr.next :

            if curr.next.val in seen :
                curr.next = curr.next.next
            else :
                curr = curr.next
        return dummy.next
