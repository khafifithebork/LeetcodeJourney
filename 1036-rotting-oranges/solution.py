class Solution:
    def orangesRotting(self, grid: list[list[int]]) -> int:
        fresh = 0
        rotten = []

        for i in range(len(grid)) :
            for j in range(len(grid[0])) :
                if grid[i][j] == 1 :
                    fresh += 1
                elif grid[i][j] == 2 :
                    rotten.append((i,j))
        
        if fresh == 0 :
            return 0
        if len(rotten) == 0 and fresh > 0 :
            return -1

        res = 0
        direc = [(0,1), (1,0), (0,-1), (-1,0)]
        visited = set()
        q = deque()
        
        for tu in rotten :
            q.append(tu)
            visited.add(tu)
        
        while q :
            for _ in range(len(q)) :
                node = q.popleft()
                
                for (dr,dc) in direc :
                    nr = node[0] + dr
                    nc = node[1] + dc

                    if 0 <= nr < len(grid) and 0 <= nc < len(grid[0]) :
                        if grid[nr][nc] == 1 :
                            if (nr, nc) not in visited :
                                grid[nr][nc] = 2
                                fresh -= 1
                                q.append((nr,nc))
                                visited.add((nr,nc))
                                if fresh == 0 :
                                    return res+1
            res += 1
        return -1

