class Solution(object):
    def minSwaps(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        tot = sum(nums)
        curr = sum(nums[:tot])
        res = tot - curr
        for r in range(tot, n + tot) :
            l = r - tot
            curr += nums[r%n]
            curr -= nums[l%n]
            res = min(tot - curr, res)
        return res
