# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumEvenGrandparent(self, root: TreeNode | None) -> int:
        if not root : 
            return 0
        ans = 0
        q = deque()
        q.append((root, None, None))
        while q :
            for _ in range(len(q)) :
                node, parent, grandparent = q.popleft()
                if grandparent :
                    if grandparent.val % 2 == 0 :
                        ans += node.val
                if node.left :
                    q.append((node.left, node, parent))
                if node.right :
                    q.append((node.right, node, parent))
        return ans
