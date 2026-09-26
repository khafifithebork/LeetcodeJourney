# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNodes(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        stack = []
        curr = head
        while curr :
            while stack and stack[-1].val < curr.val :
                stack.pop()
            stack.append(curr)
            curr = curr.next
        if not stack :
            return head
        
        for i in range(len(stack) - 1):
            stack[i].next = stack[i+1]
        stack[-1].next = None
        return stack[0]
