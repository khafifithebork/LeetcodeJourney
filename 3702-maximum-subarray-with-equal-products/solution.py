import math
class Solution:
    def maxLength(self, nums: List[int]) -> int:
        res, n = 0, len(nums)

        for l in range(len(nums)) :
            prod = gcd = lcm = nums[l]
            for r in range(len(nums)) :
                if r > l :
                    prod *= nums[r]
                    gcd = math.gcd(gcd, nums[r])
                    lcm = math.lcm(lcm, nums[r])
                if prod == gcd * lcm : res = max(res, r - l + 1)
        return res
