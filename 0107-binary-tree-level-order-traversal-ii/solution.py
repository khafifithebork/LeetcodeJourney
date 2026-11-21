# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrderBottom(self, root: TreeNode | None) -> list[list[int]]:
        if not root :
            return []
        
        ans = []
        q = deque()
        q.append(root)
        while q :
            lev = []
            for _ in range(len(q)) :
                node = q.popleft()
                lev.append(node.val)
                if node.left :
                    q.append(node.left)
                if node.right :
                    q.append(node.right)
            ans.append(lev)
        return ans[::-1]
