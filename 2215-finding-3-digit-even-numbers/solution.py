class Solution:
    def findEvenNumbers(self, digits: list[int]) -> list[int]:
        ans = set()
        n = len(digits)
        for i in range(0, n) :
            for j in range(0, n) :
                for k in range(0, n) :
                    if i != j and j != k and k != i :
                        if digits[i] == 0 :
                            continue
                        else :
                            num = digits[i] * 100 + digits[j] * 10 + digits[k]

                            if num not in ans and num % 2 == 0:
                                ans.add(num)
        ans = list(ans)
        ans.sort()
        return ans
