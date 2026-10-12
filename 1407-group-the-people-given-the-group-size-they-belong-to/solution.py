class Solution(object):
    def groupThePeople(self, groupSizes):
        """
        :type groupSizes: List[int]
        :rtype: List[List[int]]
        """
        groups = {}
        res = []

        for i, size in enumerate(groupSizes) :
            if size not in groups :
                groups[size] = []
            groups[size].append(i)

            if len(groups[size]) == size :
                res.append(groups[size])
                groups[size] = []
        return res
