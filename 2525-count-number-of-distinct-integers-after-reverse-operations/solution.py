class Solution(object):
    def countDistinctIntegers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        distincts = set(nums)

        for num in nums :
            
            distincts.add(int(str(num)[::-1]))
        
        return len(distincts)
