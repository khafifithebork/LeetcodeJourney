class Solution(object):
    def findDifferentBinaryString(self, nums):
        """
        :type nums: List[str]
        :rtype: str
        """
        res = ""
        for i in range(len(nums)) :
            c = nums[i][i]
            if c == '0' :
                res += '1'
            else :
                res += '0'
        return res 
