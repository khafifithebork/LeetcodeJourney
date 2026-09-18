class Solution(object):
    def minOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        res = 0
        for i in range(n - 2) :

            if nums[i] == 0 :
                nums[i] ^= 1
                nums[i+1] ^= 1
                nums[i+2] ^= 1
                res += 1
            else : pass
        return res if nums[n-2] == nums[n-1] == 1 else  -1


