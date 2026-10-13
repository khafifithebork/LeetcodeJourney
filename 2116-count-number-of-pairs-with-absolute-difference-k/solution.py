from collections import Counter
class Solution(object):
    def countKDifference(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count = Counter(nums)
        return sum(count[n - k] for n in nums)
        
