from collections import Counter
class Solution(object):
    def countCompleteSubarrays(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        tot = len(set(nums))
        distinct = 0
        l = 0
        freq = Counter()
        res = 0

        for r in range(len(nums)) :
            if freq[nums[r]] == 0 :
                distinct += 1
            freq[nums[r]] += 1
            while distinct == tot :
                res += len(nums) - r
                freq[nums[l]] -= 1
                if freq[nums[l]] == 0 :
                    distinct -= 1
                l+=1
        return res

