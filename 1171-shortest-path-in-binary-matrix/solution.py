class Solution:
    def shortestPathBinaryMatrix(self, grid: list[list[int]]) -> int:

        if len(grid) == 0 or grid[0][0] == 1 :
            return -1
        elif len(grid) == 1 :
            return 1
        
        direc = [(-1,-1), (-1,0), (-1,1), (0,-1), (0,1), (1,-1), (1,0), (1,1)]

        res =1
        q = deque()
        visited = set()
        q.append((0,0))
        visited.add((0,0))

        while q :
            for _ in range(len(q)):
                node = q.popleft()
                for (dr, dc) in direc :
                    nr = node[0] + dr
                    nc = node[1] + dc
                    if 0 <= nr < len(grid) and 0 <= nc < len(grid[0]) :
                        if grid[nr][nc] == 0 :
                            if (nr,nc) not in visited :
                                if (nr, nc) == (len(grid)-1, len(grid)-1) :
                                    return res + 1
                                visited.add((nr,nc))
                                q.append((nr,nc))
            res += 1
        return -1

