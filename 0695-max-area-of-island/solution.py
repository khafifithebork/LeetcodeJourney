class Solution:
    def maxAreaOfIsland(self, grid: list[list[int]]) -> int:
        if not grid or not grid[0] :
            return 0
        res = 0
        for i in range(len(grid)) :
            for j in range(len(grid[0])):
                if grid[i][j] == 1 :
                    
                    direc = [(0,1), (1,0), (-1,0), (0,-1)]
                    visited = set()
                    q = deque()
                    q.append((i,j))
                    visited.add((i,j))
                    area = 1

                    while q :
                        
                        for _ in range(len(q)) :
                            node = q.popleft()
                            for (dr,dc) in direc :
                                nr = node[0] + dr
                                nc = node[1] + dc
                                if 0 <= nr < len(grid) and 0 <= nc < len(grid[0]) :
                                    if grid[nr][nc] == 1 :
                                        if (nr,nc) not in visited :
                                            area += 1
                                            grid[nr][nc] = 0
                                            q.append((nr,nc))
                    res = max(res,area) 
        
        return res


