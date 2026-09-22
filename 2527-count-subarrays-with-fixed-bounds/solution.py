class Solution(object):
    def countSubarrays(self, nums, minK, maxK):
        """
        :type nums: List[int]
        :type minK: int
        :type maxK: int
        :rtype: int
        """
        bad, lastMin, lastMax = -1, -1, -1
        res = 0

        for r in range(len(nums)) :
            if nums[r] == minK : lastMin = r
            if nums[r] == maxK : lastMax = r
            if nums[r] < minK or nums[r] > maxK : bad = r
            res += max(0, min(lastMin, lastMax) - bad)
        return res
        
