class Solution(object):
    def decode(self, encoded, first):
        """
        :type encoded: List[int]
        :type first: int
        :rtype: List[int]
        """
        ans = []
        ans.append(first)

        for elem in encoded :
            nextelem = elem ^ ans[-1] 
            ans.append(nextelem)

        return ans        
