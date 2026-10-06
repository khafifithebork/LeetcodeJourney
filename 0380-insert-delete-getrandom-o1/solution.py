import random
class RandomizedSet:

    def __init__(self):
        self.values = []
        self.index = {}

    def insert(self, val: int) -> bool:
        if val not in self.values :
            self.index[val] = len(self.values)
            self.values.append(val)
            return True
        else : 
            return False

    def remove(self, val: int) -> bool:
        if val not in self.values :
            return False
        
        idx = self.index[val]
        last = self.values[-1]

        self.values[idx] = last
        self.index[last] = idx

        self.values.pop()
        del self.index[val] 

        return True



    def getRandom(self) -> int:
        return random.choice(self.values)


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()
