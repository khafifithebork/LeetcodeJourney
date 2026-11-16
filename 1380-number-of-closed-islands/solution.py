from collections import deque
from typing import List

class Solution:
    def closedIsland(self, grid: List[List[int]]) -> int:
        rows, cols = len(grid), len(grid[0])
        count = 0

        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] != 0:
                    continue

                queue = deque([(r, c)])
                grid[r][c] = 1
                closed = True

                while queue:
                    x, y = queue.popleft()

                    if (x == 0 or x == rows - 1 or
                        y == 0 or y == cols - 1):
                        closed = False

                    for dx, dy in directions:
                        nx, ny = x + dx, y + dy

                        if (0 <= nx < rows and
                            0 <= ny < cols and
                            grid[nx][ny] == 0):

                            grid[nx][ny] = 1
                            queue.append((nx, ny))

                if closed:
                    count += 1

        return count
