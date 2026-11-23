class Solution:
    def isRobotBounded(self, instructions: str) -> bool:
        dirs = [(0, 1), (-1, 0), (0, -1), (1, 0)]  # N, W, S, E (counter-clockwise)
        x = y = idx = 0
        for c in instructions:
            if c == 'G':
                x += dirs[idx][0]
                y += dirs[idx][1]
            elif c == 'L':
                idx = (idx + 1) % 4
            else:  # 'R'
                idx = (idx - 1) % 4
        return (x, y) == (0, 0) or idx != 0
