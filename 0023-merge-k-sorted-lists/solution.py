import heapq
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[Optional[ListNode]]
        :rtype: Optional[ListNode]
        """
        heap = []
        dummy = ListNode(0)
        tail = dummy
        for i, node in enumerate(lists) :
            if node :
                heapq.heappush(heap, (node.val, i, node))
        
        while heap :
            val, i, node = heapq.heappop(heap)

            tail.next = node
            tail = tail.next

            if node.next :
                heapq.heappush(heap, (node.next.val, i, node.next))
        return dummy.next
