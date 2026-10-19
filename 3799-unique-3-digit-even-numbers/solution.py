class Solution:
    def totalNumbers(self, digits: List[int]) -> int:
        n = len(digits)
        seen = set()
        count = 0

        for i in range(0, n) :
            for j in range(0, n) :
                for k in range(0, n) :
                    if i != j and j != k and k != i :
                        if digits[i] == 0 :
                            continue
                        digit = digits[i] * 100 + digits[j]* 10 + digits[k]

                        if digit not in seen :
                            if digit%2 == 0 :
                                count += 1
                            seen.add(digit)
        return count

