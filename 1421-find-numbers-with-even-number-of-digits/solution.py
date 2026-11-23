class Solution:
    def findNumbers(self, nums: list[int]) -> int:
        ans = 0
        for num in nums :
            if len(str(num)) % 2 == 0 :
                ans += 1
        return ans
