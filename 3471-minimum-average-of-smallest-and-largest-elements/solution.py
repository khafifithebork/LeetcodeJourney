class Solution(object):
    def minimumAverage(self, nums):
        """
        :type nums: List[int]
        :rtype: float
        """
        res = float('inf')
        nums.sort()
        r = len(nums)-1
        l =0
        while l< r:
            avg = (nums[l] + nums[r]) / 2.0
            res = min(res, avg)
            r -= 1
            l+=1
        return res
