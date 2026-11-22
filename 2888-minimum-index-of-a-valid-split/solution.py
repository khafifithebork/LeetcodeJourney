from collections import Counter
class Solution:
    def minimumIndex(self, nums: List[int]) -> int:
        freq = Counter(nums)
        x, n = 0, len(nums)
        for num in nums :
            if freq[num] > n//2 :
                x = num
                break
        f1 = 0
        for i in range(0,n-1) :      
            if nums[i] == x :
                f1 += 1
            f2 = freq[x] - f1

            if 2*f1 > (i + 1) and 2*f2 > (n-i-1) :
                return i
        return -1
