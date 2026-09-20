class Solution(object):
    def longestSubarray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l, zeros, res = 0, 0, 0
        for r in range(len(nums)) :
            if nums[r] == 0 : zeros += 1
            while zeros > 1 :
                if nums[l] == 0 : zeros -= 1
                l += 1
            res = max(r - l, res)
        return res
