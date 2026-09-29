# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseKGroup(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        def reversegment(head, tail) :
            prev = tail.next
            curr = head
            while prev != tail :
                temp = curr.next
                curr.next = prev
                prev = curr
                curr = temp
            return tail, head
        
        dummy = ListNode(0)
        dummy.next = head

        prevgroupend = dummy

        while True :
            tail = prevgroupend

            for _ in range(k) :
                tail = tail.next
                if not tail :
                    return dummy.next
                
            nextgrpstart = tail.next
            newhead, newtail = reversegment(prevgroupend.next, tail)
            prevgroupend.next = newhead
            newtail.next = nextgrpstart
            prevgroupend = newtail
        return dummy.next



