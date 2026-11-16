class Solution:
    def numEnclaves(self, grid: list[list[int]]) -> int:
        if not grid or not grid[0] : 
            return 0
        
        res = 0
        direct = [(1,0), (0,1), (-1,0), (0,-1)]
        for i in range(len(grid)) :
            for j in range(len(grid[0])) :
                if grid[i][j] == 1 :
                    cell = 1
                    q = deque()
                    q.append((i,j))
                    grid[i][j] = 0
                    closed = True
                    while q :
                        for _ in range(len(q)) :
                            node = q.popleft()
                            for (dr,dc) in direct :
                                nr = node[0] + dr
                                nc = node[1] + dc
                                if 0 <= nr < len(grid) and 0 <= nc < len(grid[0]) :
                                    if node[0] == 0 or node[0] == len(grid)-1 or node[1] == 0 or node[1] == len(grid[0])-1 :
                                        closed = False
                                    if grid[nr][nc] == 1 :
                                        cell += 1
                                        grid[nr][nc] = 0
                                        q.append((nr,nc))
                    if closed :
                            res += cell
        return res
