# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: TreeNode | None) -> list[int]:
        if not root :
            return []
        res = []
        q = deque()
        q.append(root)
        while q :
            level = []
            for _ in range(len(q)):
                node = q.popleft()
                level.append(node.val)
                if node.left :
                    q.append(node.left)
                if node.right :
                    q.append(node.right)
            res.append(level[-1])
        return res
