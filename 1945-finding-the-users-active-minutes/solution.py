class Solution(object):
    def findingUsersActiveMinutes(self, logs, k):
        """
        :type logs: List[List[int]]
        :type k: int
        :rtype: List[int]
        """
        #we need to return ans arr where ans[j] equals to users with uam = j
        ans = [0] * k
        uam = {}
        # we need to map each user to a set of his unique minute
        passed = defaultdict(set)

        for i in logs :
            user, minu = i[0], i[1]
            if minu in passed[user] :
                continue
            passed[user].add(minu)
            uam[user] = uam.get(user, 0) + 1
        for key in uam.keys() :
            ans[uam[key] - 1] += 1 
        return ans

