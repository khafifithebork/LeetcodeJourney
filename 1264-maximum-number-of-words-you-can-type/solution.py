class Solution(object):
    def canBeTypedWords(self, text, brokenLetters):
        """
        :type text: str
        :type brokenLetters: str
        :rtype: int
        """
        words = text.split(" ")
        count = 0
        for word in words :
            valid = True
            for ch in brokenLetters :
                if ch in word :
                    valid = False
            if valid :
                count += 1
        return count
