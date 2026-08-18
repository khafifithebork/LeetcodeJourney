class Solution:
    def findTheArrayConcVal(self, nums: List[int]) -> int:
        l,r= 0, len(nums)-1
        tot=0
        while l <= r :
            if l == r :
                tot+=nums[l]
            else :
                tot += int(f"{nums[l]}{nums[r]}")
            l+=1
            r-=1
        return tot

