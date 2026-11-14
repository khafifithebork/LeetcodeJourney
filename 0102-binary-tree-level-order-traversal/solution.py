# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: TreeNode | None) -> list[list[int]]:
        res = []
        if not root :
            return res
        q = deque()
        q.append(root)
        while q:
            arr = []
            for _ in range(len(q)) :
                node = q.popleft()
                arr.append(node.val)
                if node.left :
                    q.append(node.left)
                if node.right :
                    q.append(node.right)
            res.append(arr)
        return res

