class Solution(object):
    def uniqueMorseRepresentations(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        seen = []
        for word in words :
            temp = ""
            for ch in word :
                temp += morse[ord(ch) - ord('a')]
            if temp not in seen :
                seen.append(temp)
        return len(seen)

        
