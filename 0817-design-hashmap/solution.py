class MyHashMap(object):

    def __init__(self):
        self.keys = []
        self.vals = []

    def put(self, key, value):
        """
        :type key: int
        :type value: int
        :rtype: None
        """
        if key in self.keys :
            idx = self.keys.index(key)
            self.vals[idx] = value
        else :
            self.keys.append(key)
            self.vals.append(value)

    def get(self, key):
        """
        :type key: int
        :rtype: int
        """
        if key in self.keys :
            idx = self.keys.index(key)
            return self.vals[idx]
        return -1
        

    def remove(self, key):
        """
        :type key: int
        :rtype: None
        """
        if key in self.keys :
            idx = self.keys.index(key)
            self.keys.pop(idx)
            self.vals.pop(idx)


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)
