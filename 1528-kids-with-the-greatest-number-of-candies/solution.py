class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        n = len(candies)
        ans = []
        ref = max(candies)
        for candie in candies :
            ans.append((candie+extraCandies) >= ref)
        return ans
