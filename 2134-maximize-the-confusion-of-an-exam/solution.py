class Solution(object):
    def maxConsecutiveAnswers(self, ans, k):
        """
        :type answerKey: str
        :type k: int
        :rtype: int
        """
        resT, l, countT = 0, 0, 0
        for r in range(len(ans)):
            if ans[r] == 'F' :
                countT += 1
            while countT > k :
                if ans[l] == 'F' :
                    countT -= 1
                l+=1
            resT = max(resT, r - l + 1)
        resF, l, countF = 0, 0, 0

        for j in range(len(ans)):
            if ans[j] == 'T' :
                countF += 1
            while countF > k :
                if ans[l] == 'T' :
                    countF -= 1
                l+=1
            resF = max(resF, j - l + 1)
        return max(resF, resT)
                    
