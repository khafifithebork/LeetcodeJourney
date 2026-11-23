class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        ans = su = 0
        pr = 1
        for ch in str(n) :
            su += int(ch)
            pr *= int(ch)
        return pr - su
