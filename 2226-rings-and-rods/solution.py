class Solution(object):
    def countPoints(self, rings):
        """
        :type rings: str
        :rtype: int
        """
        rods = {}

        for i in range(0, len(rings), 2) :
            color = rings[i]
            rod = rings[i+1]

            if rod not in rods :
                rods[rod] = set()
            rods[rod].add(color)
        return sum(1 for rod in rods if len(rods[rod]) == 3)

