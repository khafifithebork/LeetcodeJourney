class Solution:
    def canMakeSubsequence(self, str1: str, str2: str) -> bool:
        i,j=0,0
        n = (ord(str1[i]) - ord(str2[j])) % 26
        while i < len(str1) and j < len(str2) :
            next_char = chr((ord(str1[i]) - ord('a') + 1) % 26 + ord('a'))
            if str1[i] == str2[j] or str2[j] == next_char : 
                j+=1
            i+=1
        return j == len(str2)
