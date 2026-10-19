from collections import Counter
class Solution:
    def repeatedNTimes(self, nums: list[int]) -> int:
        n = len(nums)/2
        freq = Counter(nums)

        for num in nums :
            if freq[num] == n :
                return num
        return -1 
