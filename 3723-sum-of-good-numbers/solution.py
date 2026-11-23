class Solution:
    def sumOfGoodNumbers(self, nums: List[int], k: int) -> int:
        ans = 0
        for i in range(0,len(nums)) :
            if i - k >= 0 and i+k < len(nums) :
                if nums[i-k] < nums[i] and nums[i+k] < nums[i] :
                    ans += nums[i]
            if i - k < 0 :
                if nums[i+k] < nums[i] :
                    ans += nums[i]
            if i + k >= len(nums) :
                if nums[i-k] < nums[i] :
                    ans += nums[i]
        return ans

