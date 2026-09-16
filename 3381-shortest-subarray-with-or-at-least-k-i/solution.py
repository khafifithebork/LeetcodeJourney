class Solution:
    def minimumSubarrayLength(self, nums: List[int], k: int) -> int:
        res = float('inf')
        for i in range(len(nums)) :
            curr = nums[i]
            for j in range(i, len(nums)) :
                curr |= nums[j]
                if curr >= k :
                    res = min(j - i + 1, res)
                    break
        return res if res != float('inf') else -1


