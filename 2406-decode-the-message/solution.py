class Solution(object):
    def decodeMessage(self, key, message):
        """
        :type key: str
        :type message: str
        :rtype: str
        """
        decode = {}
        idx = 0
        for k in key :
            if k != ' ' and k not in decode :
                decode[k] = chr(ord('a') + idx) 
                idx += 1
                
        return ''.join(decode.get(c, ' ') for c in message)
