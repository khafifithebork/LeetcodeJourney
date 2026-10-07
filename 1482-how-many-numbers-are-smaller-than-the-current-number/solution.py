class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        sorted_nums = sorted(nums)
        rank = {}
        for idx, val in enumerate(sorted_nums):
            if val not in rank:
                rank[val] = idx
        return [rank[n] for n in nums]
                    
