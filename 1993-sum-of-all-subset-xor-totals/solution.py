class Solution(object):
    def subsetXORSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        if n == 0 :
            return 0
        tot = 0
        for i in range(n) :
            tot |= nums[i]
            
        return tot * 2**(n-1)
