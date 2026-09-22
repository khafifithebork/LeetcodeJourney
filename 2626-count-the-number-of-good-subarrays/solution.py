from collections import Counter

class Solution(object):
    def countGood(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        freq = Counter()
        res, l, pairs = 0, 0, 0

        for r in range(len(nums)) :

            pairs += freq[nums[r]]
            freq[nums[r]] += 1

            while pairs >= k :
                freq[nums[l]] -= 1
                pairs -= freq[nums[l]]
                res += len(nums) - r
                l+=1

        return res
