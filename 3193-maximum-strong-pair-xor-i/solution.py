class Solution:
    def maximumStrongPairXor(self, nums: List[int]) -> int:
        nums.sort()
        res=0
        r=0
        for l in range(len(nums)):
            x = nums[l]
            while r < len(nums) and abs(x-nums[r]) <= min(x, nums[r]) : 
                r+=1
            for i in range(l, r):
                res = max(res, nums[l] ^ nums[i])
        return res
