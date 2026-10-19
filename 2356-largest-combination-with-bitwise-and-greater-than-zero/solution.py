class Solution:
    def largestCombination(self, candidates: list[int]) -> int:
        mapp = {i:0 for i in range(32)}

        for n in candidates:
            for i in range(32):
                mapp[i] += 1 if n & (2**i) else 0
        return max(mapp.values())
