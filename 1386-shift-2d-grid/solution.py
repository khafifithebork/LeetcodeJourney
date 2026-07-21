class Solution:
    def shiftGrid(self, grid: List[List[int]], k: int) -> List[List[int]]:
        rows = len(grid)
        cols = len(grid[0])
        total = rows * cols

        res = [[0] * cols for _ in range(rows)]
        
        for i in range(rows):
            for j in range(cols):
                flat_idx = i * cols + j
                new_flat_idx = (flat_idx + k) % total
                new_i = new_flat_idx // cols
                new_j = new_flat_idx % cols
                res[new_i][new_j] = grid[i][j]
                
        return res
