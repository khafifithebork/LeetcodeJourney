from collections import Counter
class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        freq = Counter(nums)
        frqmax = 0
        for num in nums :
            frqmax = max(frqmax, freq[num])

        ans =0
        for f in freq.values() :
            if f == frqmax :
                ans += frqmax
        return ans
