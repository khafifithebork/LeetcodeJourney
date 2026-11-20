class Solution:
    def allPathsSourceTarget(self, graph: list[list[int]]) -> list[list[int]]:
        target = len(graph) - 1
        q = deque([(0, [[0]])])
        ans = []

        while q :
            node, paths = q.popleft()
            
            if node == target :
                ans.extend(paths)

            for v in graph[node] :
                new = []
                for p in paths :
                    new.append(p + [v])
                q.append((v, new))
        return ans      
