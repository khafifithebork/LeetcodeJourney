class Solution:
    def numOfPairs(self, nums: list[str], target: str) -> int:
        ans = 0
        n = len(nums)
        for i in range(0, n) :
            for j in range(0, n) :
                if i != j and nums[i] + nums[j] == target :
                    ans += 1
                    
        return ans
