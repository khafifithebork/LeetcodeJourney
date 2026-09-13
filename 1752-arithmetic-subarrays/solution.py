class Solution:
    def checkArithmeticSubarrays(self, nums: List[int], l: List[int], r: List[int]) -> List[bool]:
        ans = []
        for i in range(len(l)) :
            sub = sorted(nums[l[i]:r[i]+1])
            exp = sub[1] - sub[0]
            is_arith = True
            for j in range (1, len(sub)) :
                if sub[j] - sub[j-1] != exp :
                    is_arith = False
                    break
            ans.append(is_arith)
        return ans



