# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        slow = head
        fast = head
        while fast and fast.next :
            slow = slow.next
            fast = fast.next.next
        
        prev = None
        current = slow
        while current :
            nextnode = current.next
            current.next = prev
            prev = current
            current = nextnode
        
        maxsum = 0
        firsthalf = head
        secondhalf = prev
        while secondhalf :
            twinsum = firsthalf.val + secondhalf.val
            maxsum = max(maxsum, twinsum)
            firsthalf = firsthalf.next
            secondhalf = secondhalf.next
        return maxsum

