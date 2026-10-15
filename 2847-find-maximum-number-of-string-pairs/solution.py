class Solution(object):
    def maximumNumberOfStringPairs(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        wordset = set(words)
        count = 0
        for word in words :
            if word[::-1] in wordset and word[::-1] != word :
                count += 1
        return count//2
