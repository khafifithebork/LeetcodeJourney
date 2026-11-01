class Solution:
    def distributeCandies(self, candyType: list[int]) -> int:
        ans = int(len(candyType) / 2)
        sett = set(candyType)
        if len(sett) >= ans :
            return ans
        return len(sett)
