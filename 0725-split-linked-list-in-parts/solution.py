# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def splitListToParts(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: List[Optional[ListNode]]
        """
        curr = head
        length = 0
        while curr :
            length +=1 
            curr = curr.next

        size = length // k
        extra = length % k

        curr = head
        res = [None] * k

        for i in range(k):
            res[i] = curr
            psize = size + (1 if i < extra else 0)

            for j in range (psize-1):
                if curr : curr = curr.next
            if curr :
                curr.next, curr = None, curr.next
        return res  


