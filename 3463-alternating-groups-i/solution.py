class Solution:
    def numberOfAlternatingGroups(self, colors: List[int]) -> int:
        count = 0
        n = len(colors)
        for i in range(n) : 
            if colors[i] != colors[(i+1)%n] != colors[(i+2)%n] :
                count += 1
        return count
