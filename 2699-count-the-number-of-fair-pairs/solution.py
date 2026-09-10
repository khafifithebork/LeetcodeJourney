class Solution:
    def countFairPairs(self, nums: List[int], lower: int, upper: int) -> int:
        nums.sort()
        def count(limit) : 
            l, r, res = 0, len(nums)-1, 0
            while l < r :
                if nums[l] + nums[r] <= limit :
                    res += r-l
                    l+=1
                else :
                    r-=1
            return res
        return count(upper) - count(lower-1)
            
