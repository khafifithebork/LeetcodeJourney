class Solution:
    def findDuplicates(self, nums: list[int]) -> list[int]:
        ans = []
        for num in nums :
            val = abs(num)
            idx = val - 1

            if nums[idx] < 0 :
                ans.append(val)
            else :
                nums[idx] = - nums[idx]
        return ans

