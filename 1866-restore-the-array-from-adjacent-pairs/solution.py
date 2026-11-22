class Solution:
    def restoreArray(self, adjacentPairs: list[list[int]]) -> list[int]:
        n = len(adjacentPairs)
        adj = defaultdict(list)
        for u, v in adjacentPairs :
            adj[u].append(v)
            adj[v].append(u)
        
        start = None
        for node in adj :
            if len(adj[node]) == 1 :
                start = node
        ans = [start]
        curr = start
        prev = None
        while len(ans) < n+1 :
            nxt = None
            neighbours = adj[curr]
            for nei in neighbours :
                if nei != prev :
                    nxt = nei
            prev = curr
            curr = nxt
            ans.append(curr)
        return ans



