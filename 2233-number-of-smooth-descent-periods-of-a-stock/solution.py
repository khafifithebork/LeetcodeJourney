class Solution(object):
    def getDescentPeriods(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """ 
        streak, res = 1, 1
        for r in range(1, len(prices)) :
            if prices[r-1] - prices[r] == 1 :
                streak += 1
            else : 
                streak = 1
            res += streak
        return res

