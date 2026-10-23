class Solution:
    def distinctDifferenceArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        diff = []
        
        for i in range(0, n) :
            prefix, suffix = set(), set()
            for j in range(0, i+1) :
                prefix.add(nums[j])

            for j in range(i+1, n) :
                suffix.add(nums[j])

            diff.append(len(prefix) - len(suffix))

        return diff
