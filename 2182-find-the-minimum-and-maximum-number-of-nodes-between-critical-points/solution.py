# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def nodesBetweenCriticalPoints(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: List[int]
        """
        indices = []
        curr = head.next
        prev = head
        idx = 1
        
        while curr.next :
            if curr.val < prev.val and curr.val < curr.next.val :
                indices.append(idx)
            if curr.val > prev.val and curr.val > curr.next.val :
                indices.append(idx)
            idx+=1
            prev = curr
            curr = curr.next
        
        minDis = float('inf')
        
        for i in range(1, len(indices)) :
            minDis = min(minDis, indices[i]- indices[i-1])
        
        return [minDis, indices[len(indices) - 1] - indices[0]] if len(indices) >= 2 else [-1, -1]


        
