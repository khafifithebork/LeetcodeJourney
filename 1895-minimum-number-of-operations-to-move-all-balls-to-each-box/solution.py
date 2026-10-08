class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        res = []
        for i in range(len(boxes)):
            moves = 0 
            for j in range(len(boxes)):
                if i != j:
                    moves += abs(i-j) * int(boxes[j])
            res.append(moves)
        return res




        
