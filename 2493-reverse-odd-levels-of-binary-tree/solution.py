# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def reverseOddLevels(self, root: TreeNode | None) -> TreeNode | None:
        q = deque()
        q.append(root)
        level = 0
        while q :
            
            if level % 2 != 0 :
                r = len(q) - 1
                l = 0
                while l < r :
                    q[l].val, q[r].val = q[r].val, q[l].val
                    r-=1
                    l+=1

            for _ in range(len(q)) :
                node = q.popleft()
                if node.left and node.right :
                    q.append(node.left)
                    q.append(node.right)
            level += 1
        
        return root 
