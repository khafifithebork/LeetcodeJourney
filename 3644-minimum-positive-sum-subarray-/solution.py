class Solution(object):
    def minimumSumSubarray(self, nums, l, r):
        """
        :type nums: List[int]
        :type l: int
        :type r: int
        :rtype: int
        """
        res= float('inf')
        for size in range(l, r+1) :
            minsum=0
            for i in range(len(nums) - size + 1) :
                minsum = sum(nums[i:i+size])
                if minsum > 0 : res = min(res, minsum)
        return res if res != float('inf') else -1
