# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:
        if not original or not cloned :
            return
        orig = deque([original,])
        clon = deque([cloned,])
        while orig and clon :
            for _ in range(len(orig)) :
                node_orig = orig.popleft()
                node_clon = clon.popleft()

                if node_orig is target :
                    return node_clon
                
                if node_orig.left :
                    orig.append(node_orig.left)
                    clon.append(node_clon.left)
                if node_orig.right :
                    orig.append(node_orig.right)
                    clon.append(node_clon.right)
            

