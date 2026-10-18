from collections import Counter
class Solution:
    def sumOfUnique(self, nums: list[int]) -> int:
        freq = Counter(nums)
        ans = 0
        for num in nums :
            if freq[num] == 1 :
                ans += num
        return ans
