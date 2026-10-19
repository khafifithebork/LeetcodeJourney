from collections import Counter
class Solution:
    def sumDivisibleByK(self, nums: List[int], k: int) -> int:
        freq = Counter(nums)
        count = 0
        for num in nums :
            if freq[num] % k == 0 :
                count += num
        return count
