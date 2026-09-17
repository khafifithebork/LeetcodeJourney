class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        rain = 0
        l , r = 0 , len(height) - 1
        mL = height [l]
        mR = height [r]

        while l < r:
            if mL < mR :
                l+=1
                mL = max(mL,height[l])
                rain += mL - height[l]
            else : 
                r-=1
                mR = max(mR,height[r])
                rain += mR - height[r]
        return rain
