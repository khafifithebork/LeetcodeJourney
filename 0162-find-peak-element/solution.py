class Solution:
    def findPeakElement(self, nums: list[int]) -> int:
        n = len(nums)
        if n == 1 : return 0
        if nums[0] > nums[1] : return 0
        if nums[n-1] > nums[n-2] : return n-1

        l, r = 0, n-1

        while l < r :
            m = l+ (r-l)//2

            if  nums[m-1] < nums[m] and nums[m+1] < nums[m]  :
                return m
            elif nums[m-1] > nums[m] :
                r = m + 1
            elif nums[m+1] > nums[m] :
                l = m
        return -1
                
