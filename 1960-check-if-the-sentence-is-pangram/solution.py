class Solution(object):
    def checkIfPangram(self, sentence):
        """
        :type sentence: str
        :rtype: bool
        """
        seen = []
        for s in sentence :
            if s not in seen :
                seen.append(s)
        return len(seen) == 26
