class Solution:
    def judgeCircle(self, moves: str) -> bool:
        direc = {'U' : (1,0),
                'D' : (-1,0),
                'L' : (0,1),
                'R' : (0,-1)}
        
        start = (0,0)
        for move in moves :
            dx, dy = direc[move]
            start = (start[0] + dx, start[1] + dy)
        return start == (0,0)
