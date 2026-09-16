class Solution:
    def countKConstraintSubstrings(self, s: str, k: int) -> int:
        count, l, zeros, ones = 0, 0, 0, 0
        for r in range(len(s)) :
            if s[r] == '0' : zeros += 1 
            else : ones += 1
            while zeros > k and ones > k :
                if s[l] == '0' : zeros -= 1 
                else : ones -= 1
                l += 1
            count += r - l + 1
        return count
