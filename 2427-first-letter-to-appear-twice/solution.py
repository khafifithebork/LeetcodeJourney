class Solution:
    def repeatedCharacter(self, s: str) -> str:
        sett = set()
        for c in s :
            if c in sett:
                return c
            else :
                sett.add(c)

