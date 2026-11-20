# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class FindElements:

    def __init__(self, root: TreeNode | None):
        self.seen = set()
        self.bfs(root)

    def find(self, target: int) -> bool:
        return target in self.seen
    
    def bfs(self, root: TreeNode) -> None :
        q = deque()
        root.val = 0
        q.append(root)
        while q :
            for _ in range(len(q)):
                node = q.popleft()
                self.seen.add(node.val)
                if node.left :
                    node.left.val = node.val * 2 + 1
                    q.append(node.left)
                if node.right :
                    node.right.val = node.val * 2 + 2
                    q.append(node.right)



# Your FindElements object will be instantiated and called as such:
# obj = FindElements(root)
# param_1 = obj.find(target)
