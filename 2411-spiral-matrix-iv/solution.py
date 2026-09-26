# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def spiralMatrix(self, m, n, head):
        """
        :type m: int
        :type n: int
        :type head: Optional[ListNode]
        :rtype: List[List[int]]
        """
        top, bottom, left, right= 0, m-1, 0, n-1
        res = [[-1 for _ in range(n)] for _ in range(m)]
        curr = head

        while curr and left <= right and top <= bottom :

            if curr and top <= bottom :
                if not curr : break
                for col in range(left, right+1) :
                    if not curr : break
                    res[top][col] = curr.val
                    curr = curr.next
                top +=1

            if curr and left <= right :
                if not curr : break
                for lign in range(top, bottom+1) :
                    if not curr : break
                    res[lign][right] = curr.val
                    curr = curr.next
                right-=1

            if curr and top <= bottom :
                for col in range(right, left-1, -1) :
                    if not curr : break
                    res[bottom][col] = curr.val
                    curr=curr.next
                bottom -= 1

            if curr and left<=right :
                for lign in range(bottom, top-1, -1) :
                    if not curr : break
                    res[lign][left] = curr.val
                    curr = curr.next
                left += 1

        return res
