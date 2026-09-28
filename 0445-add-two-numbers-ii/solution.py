# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        s1 = []
        s2 = []
        
        curr1 = l1
        curr2 = l2
        while curr1 :
            s1.append(curr1.val)
            curr1 = curr1.next
        while curr2 :
            s2.append(curr2.val)
            curr2 = curr2.next
        
        dummy = ListNode(None)
        carry = 0

        while s1 or s2 or carry  :
            val1 = s1.pop() if s1 else 0
            val2 = s2.pop() if s2 else 0
            total = val1 + val2 + carry
            digit = total % 10
            carry = total // 10

            new_node = ListNode(digit)
            new_node.next = dummy.next
            dummy.next = new_node
        
        return dummy.next

